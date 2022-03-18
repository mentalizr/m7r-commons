package org.mentalizr.commons.dirs.host;

import org.mentalizr.commons.dirs.M7rDir;

public class TomcatLogDir extends M7rDir {

    private static final String NAME = "tomcat";

    public static TomcatLogDir createInstance() {
        return new TomcatLogDir(M7rHostLogDir.createInstance());
    }

    private TomcatLogDir(M7rHostLogDir m7rHostLogDir) {
        super(m7rHostLogDir.asPath().resolve(NAME));
    }
}
