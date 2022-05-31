package org.mentalizr.commons.paths.container;

import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class TomcatContainerContentDir extends M7rDir {

    public TomcatContainerContentDir() {
        super(Paths.get("/mentalizr/content"));
    }

}
