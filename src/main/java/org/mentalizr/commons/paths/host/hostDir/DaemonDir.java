package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class DaemonDir extends M7rDir {

    public DaemonDir() {
        super(M7rPaths.getM7rHostDir(), "daemon");
    }

}
