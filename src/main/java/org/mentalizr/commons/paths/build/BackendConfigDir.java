package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.GitReposDir;

public class BackendConfigDir extends M7rDir {

    public BackendConfigDir() {
        super(GitReposDir.createInstance().asPath().resolve("core/m7r-backend-config"));
    }

}
