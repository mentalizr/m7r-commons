package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rDir;

public class M7rClientBackupDir extends M7rDir {

    public static M7rClientBackupDir createInstance() {
        return new M7rClientBackupDir(M7rClientDir.createInstance());
    }

    private M7rClientBackupDir(M7rClientDir m7rClientCliDir) {
        super(m7rClientCliDir.asPath().resolve("backup"));
    }

}
