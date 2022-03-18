package org.mentalizr.commons.dirs.host;

import org.mentalizr.commons.EnvVarConfig;
import org.mentalizr.commons.dirs.M7rDir;

import java.nio.file.Paths;

public class M7rHostDir extends M7rDir {

    public static M7rHostDir createInstance() {
        return new M7rHostDir();
    }

    private M7rHostDir() {
        super(Paths.get(EnvVarConfig.getMentalizrHostDir()));
    }

}
