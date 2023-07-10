package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class BackupDestinationDir extends M7rDir {

    public BackupDestinationDir() {
        super(M7rPaths.getM7rHostDir(), "backup");
    }

}
