package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class ExpiredDir extends M7rDir {

    public ExpiredDir() {
        super(M7rPaths.getM7rHostDir(), "expired");
    }

}
