package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class BackupDefaultDir extends M7rDir {

    public BackupDefaultDir() {
        super(M7rPaths.getM7rHostDir(), "backup-default");
    }

}
