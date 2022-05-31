package org.mentalizr.commons.paths.container;

import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class TomcatContainerImgBaseTmpDir extends M7rDir {

    public TomcatContainerImgBaseTmpDir() {
        super(Paths.get("/mentalizr/img-base-tmp"));
    }

}
