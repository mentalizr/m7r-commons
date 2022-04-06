package org.mentalizr.commons.paths.host;

import org.mentalizr.commons.EnvVarConfig;
import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class ContentDir extends M7rDir {

    public static ContentDir createInstance() {
        return new ContentDir();
    }

    private ContentDir() {
        super(Paths.get(EnvVarConfig.getMentalizrContentDir()));
    }
}
