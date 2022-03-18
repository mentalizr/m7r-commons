package org.mentalizr.commons.dirs.host;

import org.mentalizr.commons.dirs.M7rDir;

public class M7rHostLogDir extends M7rDir {

    public static M7rHostLogDir createInstance() {
        return new M7rHostLogDir(M7rHostDir.createInstance());
    }

    private M7rHostLogDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("log"));
    }

}
