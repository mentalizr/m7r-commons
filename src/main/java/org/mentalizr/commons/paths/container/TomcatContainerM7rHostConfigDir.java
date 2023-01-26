package org.mentalizr.commons.paths.container;

import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class TomcatContainerM7rHostConfigDir extends M7rDir {

    public static String asAbsolutePathString() {
        TomcatContainerM7rHostConfigDir tomcatContainerM7rHostConfigDir = new TomcatContainerM7rHostConfigDir();
        return tomcatContainerM7rHostConfigDir.toAbsolutePathString();
    }

    public TomcatContainerM7rHostConfigDir() {
        super(Paths.get("/mentalizr/config"));
    }

}
