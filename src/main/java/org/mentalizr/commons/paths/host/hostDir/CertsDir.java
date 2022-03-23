package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;

public class CertsDir extends M7rDir {

    public static CertsDir createInstance() {
        return new CertsDir(M7rHostDir.createInstance());
    }

    public CertsDir(M7rHostDir m7rHostDir) {
        super(m7rHostDir.asPath().resolve("certs"));
    }

}
