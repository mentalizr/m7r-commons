package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.M7rPaths;

public class TomcatLogDir extends M7rDir {

    public TomcatLogDir() {
        super(M7rPaths.getM7rHostLogDir(), "tomcat");
    }

}
