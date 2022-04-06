package org.mentalizr.commons.paths.host;

import org.mentalizr.commons.EnvVarConfig;
import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class GitReposDir extends M7rDir {

    public static GitReposDir createInstance() {
        return new GitReposDir();
    }

    private GitReposDir() {
        super(Paths.get(EnvVarConfig.getMentalizrGitReposDir()));
    }
}
