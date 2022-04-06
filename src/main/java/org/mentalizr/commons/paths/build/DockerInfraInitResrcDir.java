package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.GitReposDir;

public class DockerInfraInitResrcDir extends M7rDir {

    public DockerInfraInitResrcDir() {
        super(GitReposDir.createInstance().asPath().resolve("infra/m7r-docker-infra/init/resrc"));
    }
}
