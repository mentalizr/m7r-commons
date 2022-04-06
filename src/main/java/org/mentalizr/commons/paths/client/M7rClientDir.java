package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.EnvVarConfig;
import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class M7rClientDir extends M7rDir {

    public static M7rClientDir createInstance() {
        return new M7rClientDir();
    }

    private M7rClientDir() {
        super(Paths.get(EnvVarConfig.getMentalizrClientDir()));
    }

}
