package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class M7rHostConfigDir extends M7rDir {

    public static M7rHostConfigDir createInstance() {
        return new M7rHostConfigDir(M7rHostDir.createInstance());
    }

    private M7rHostConfigDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("config"));
    }

}
