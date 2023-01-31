package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rHostLogDir extends M7rDir {

    public M7rHostLogDir() {
        super(M7rPaths.getM7rHostDir(),"log");
    }

}
