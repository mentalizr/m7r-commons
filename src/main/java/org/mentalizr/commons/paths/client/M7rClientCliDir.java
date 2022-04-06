package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.hostDir.M7rHostDir;

public class M7rClientCliDir extends M7rDir {

    public static M7rClientCliDir createInstance() {
        return new M7rClientCliDir(M7rClientDir.createInstance());
    }

    private M7rClientCliDir(M7rClientDir m7rClientDir) {
        super(m7rClientDir.asPath().resolve("cli"));
    }

}
