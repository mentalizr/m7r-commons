package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rDir;

public class M7rClientCreateDir extends M7rDir {

    public static M7rClientCreateDir createInstance() {
        return new M7rClientCreateDir(M7rClientDir.createInstance());
    }

    private M7rClientCreateDir(M7rClientDir m7rClientCliDir) {
        super(m7rClientCliDir.asPath().resolve("create"));
    }

}
