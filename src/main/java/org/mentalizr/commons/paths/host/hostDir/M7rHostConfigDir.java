package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rHostConfigDir extends M7rDir {

    public M7rHostConfigDir() {
        super(M7rPaths.getM7rHostDir().asPath().resolve("config"));
    }

}
