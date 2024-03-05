package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rDir;

public class M7rClientLogDir extends M7rDir {

    public static M7rClientLogDir createInstance() {
        return new M7rClientLogDir(M7rClientDir.createInstance());
    }

    private M7rClientLogDir(M7rClientDir m7rClientDir) {
        super(m7rClientDir.asPath().resolve("log"));
    }

}
