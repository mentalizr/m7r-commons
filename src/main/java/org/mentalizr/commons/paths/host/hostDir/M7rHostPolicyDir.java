package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class M7rHostPolicyDir extends M7rDir {

    public static M7rHostPolicyDir createInstance() {
        return new M7rHostPolicyDir(M7rHostDir.createInstance());
    }

    private M7rHostPolicyDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("policy"));
    }

}
