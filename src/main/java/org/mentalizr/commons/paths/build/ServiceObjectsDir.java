package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.GitReposDir;

public class ServiceObjectsDir extends M7rDir {

    public ServiceObjectsDir() {
        super(GitReposDir.createInstance().asPath().resolve("core/m7r-service-objects"));
    }

}
