package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class CertsDir extends M7rDir {

    public CertsDir() {
        super(M7rPaths.getM7rHostDir(), "certs");
    }

}
