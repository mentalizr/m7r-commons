package org.mentalizr.commons;

import de.arthurpicht.utils.io.file.SingleValueFile;
import de.arthurpicht.utils.io.nio2.FileUtils;
import org.mentalizr.commons.paths.host.hostDir.M7rDaemonActiveFlagFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DaemonActiveFlagFile {

    private static final Path activeFlagFile = new M7rDaemonActiveFlagFile().asPath();

    public static boolean exists() {
        return FileUtils.isExistingRegularFile(activeFlagFile);
    }

    public static void create() throws IOException {
        if (exists())
            throw new IllegalStateException("DaemonActiveFlagFile file already exists. Check before calling.");
        if (!FileUtils.isExistingDirectory(activeFlagFile.getParent()))
            Files.createDirectories(activeFlagFile.getParent());
        SingleValueFile singleValueFile = new SingleValueFile(activeFlagFile);
        singleValueFile.write("Daemon active flag file. Existence of file indicates that daemon is active.");
    }

    public static void delete() throws IOException {
        if (!exists())
            throw new IllegalStateException("DaemonActiveFlagFile does not exist. Check before calling.");
        Files.deleteIfExists(activeFlagFile);
    }

}
