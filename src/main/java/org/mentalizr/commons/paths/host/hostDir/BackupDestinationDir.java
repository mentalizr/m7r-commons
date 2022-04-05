package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class BackupDestinationDir extends M7rDir {

    public static BackupDestinationDir createInstance() {
        return new BackupDestinationDir(M7rHostDir.createInstance());
    }

    public BackupDestinationDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("backup"));
    }

}
