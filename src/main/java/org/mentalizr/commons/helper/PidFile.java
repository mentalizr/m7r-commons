package org.mentalizr.commons.helper;

import de.arthurpicht.utils.io.file.SingleValueFile;
import de.arthurpicht.utils.io.nio2.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class PidFile {

    private final Path pidFile;

    public PidFile(Path pidFile) {
        this.pidFile = pidFile;
    }

    public Path asPath() {
        return this.pidFile;
    }

    public void create() throws IOException {
        Path parentDir = this.pidFile.getParent();
        if (!FileUtils.isExistingDirectory(parentDir))
            Files.createDirectories(parentDir);
        SingleValueFile pidFile = new SingleValueFile(this.pidFile);
        long pid = ProcessHandle.current().pid();
        pidFile.write(Long.toString(pid));
    }

    public void removeIfExists() throws IOException {
        if (!FileUtils.isExistingRegularFile(this.pidFile)) return;
        Files.delete(this.pidFile);
    }

    public boolean exists() {
        return FileUtils.isExistingRegularFile(this.pidFile);
    }

    public int getPid() throws IOException {
        if (!exists())
            throw new IllegalStateException("PID file [" + this.pidFile.toAbsolutePath() + "] does not exist. " +
                    "Check before calling.");
        SingleValueFile pidFile = new SingleValueFile(this.pidFile);
        return Integer.parseInt(pidFile.read());
    }

}
