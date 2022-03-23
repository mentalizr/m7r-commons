package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rFile;

public class BuildDateFile extends M7rFile {

    public BuildDateFile() {
        super(new BackendDir().asPath().resolve("src/main/resources/builddate.txt"));
    }
}
