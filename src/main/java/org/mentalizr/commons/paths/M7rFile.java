package org.mentalizr.commons.paths;

import de.arthurpicht.utils.io.nio2.FileUtils;

import java.nio.file.Path;

public abstract class M7rFile {

    protected final Path file;

    public M7rFile(Path file) {
        this.file = file;
    }

    public String getDescription() {
        return "<no description specified>";
    }

    public boolean exists() {
        return FileUtils.isExistingRegularFile(this.file);
    }

    public Path asPath() {
        return this.file;
    }

    public String toAbsolutePathString() {
        return this.file.toAbsolutePath().toString();
    }

    public String getFileName() {
        return this.file.getFileName().toString();
    }

}
