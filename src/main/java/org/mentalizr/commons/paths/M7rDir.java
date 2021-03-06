package org.mentalizr.commons.paths;

import de.arthurpicht.utils.io.nio2.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public abstract class M7rDir {

    protected final Path dir;

    public M7rDir(Path path) {
        this.dir = path;
    }

    public String getDescription() {
        return "<no description specified>";
    }

    public Path asPath() {
        return this.dir;
    }

    public boolean exists() {
        return FileUtils.isExistingDirectory(this.dir);
    }

    public void create() throws IOException {
        Files.createDirectories(this.dir);
    }

    public String toAbsolutePathString() {
        return this.dir.toAbsolutePath().toString();
    }

}
