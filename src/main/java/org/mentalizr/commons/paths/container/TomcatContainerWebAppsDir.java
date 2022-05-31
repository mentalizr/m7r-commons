package org.mentalizr.commons.paths.container;

import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class TomcatContainerWebAppsDir extends M7rDir {

    public TomcatContainerWebAppsDir() {
        super(Paths.get("/man/tomcat/webapps"));
    }

}
