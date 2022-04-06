package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rDir;
import org.mentalizr.commons.paths.host.GitReposDir;

public class WebComponentsDir extends M7rDir {

    public WebComponentsDir() {
        super(GitReposDir.createInstance().asPath().resolve("core/m7r-web-components"));
    }
}
