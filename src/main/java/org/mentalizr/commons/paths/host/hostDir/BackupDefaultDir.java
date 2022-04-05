package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class BackupDefaultDir extends M7rDir {

    public static BackupDefaultDir createInstance() {
        return new BackupDefaultDir(M7rHostDir.createInstance());
    }

    public BackupDefaultDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("backup-default"));
    }

}
