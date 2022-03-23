package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class M7rHostTempDir extends M7rDir {

    public static M7rHostTempDir createInstance() {
        return new M7rHostTempDir(M7rHostDir.createInstance());
    }

    private M7rHostTempDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("temp"));
    }

}
