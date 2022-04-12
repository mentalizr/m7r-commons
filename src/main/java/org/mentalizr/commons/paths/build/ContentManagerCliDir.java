package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.GitReposDir;

public class ContentManagerCliDir extends M7rDir {

    public ContentManagerCliDir() {
        super(GitReposDir.createInstance().asPath().resolve("core/m7r-content-manager-cli"));
    }

}
