package org.mentalizr.commons.paths.container;

import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class TomcatContainerContentTestDir extends M7rDir {

    public TomcatContainerContentTestDir() {
        super(Paths.get("/mentalizr/content-test"));
    }

}
