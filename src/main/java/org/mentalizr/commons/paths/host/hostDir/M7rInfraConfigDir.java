package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class M7rInfraConfigDir extends M7rDir {

    public static M7rInfraConfigDir createInstance() {
        return new M7rInfraConfigDir(M7rHostDir.createInstance());
    }

    private M7rInfraConfigDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("config"));
    }

}
