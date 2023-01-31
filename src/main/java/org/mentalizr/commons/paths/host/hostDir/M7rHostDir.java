package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.EnvVarConfig;
import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class M7rHostDir extends M7rDir {

    public M7rHostDir() {
        super(Paths.get(EnvVarConfig.getMentalizrHostDir()));
    }

    @Override
    public String getDescription() {
        return "m7r host config directory";
    }

}
