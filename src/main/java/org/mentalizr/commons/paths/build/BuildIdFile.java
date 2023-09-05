package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rFile;

public class BuildIdFile extends M7rFile {

    public BuildIdFile() {
        super(new BackendDir().asPath().resolve("src/main/resources/buildId.txt"));
    }
}
