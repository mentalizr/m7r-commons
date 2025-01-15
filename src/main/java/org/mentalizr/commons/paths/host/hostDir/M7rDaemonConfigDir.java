package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rDaemonConfigDir extends M7rDir {

    public M7rDaemonConfigDir() {
        super(M7rPaths.getM7rHostDir(),"daemon");
    }

}
