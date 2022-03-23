package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.GitReposDir;

public class BackendDir extends M7rDir {

    public BackendDir() {
        super(GitReposDir.getInstance().asPath().resolve("core/m7r-backend"));
    }
}
