package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class M7rHostConfigCommonDir extends M7rDir {

    public static M7rHostConfigCommonDir createInstance() {
        return new M7rHostConfigCommonDir(M7rHostConfigDir.createInstance());
    }

    private M7rHostConfigCommonDir(M7rHostConfigDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("common"));
    }

}
