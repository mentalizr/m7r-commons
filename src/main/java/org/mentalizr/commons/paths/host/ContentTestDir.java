package org.mentalizr.commons.paths.host;

import org.mentalizr.commons.EnvVarConfig;
import org.mentalizr.commons.paths.M7rDir;

import java.nio.file.Paths;

public class ContentTestDir extends M7rDir {

    public static ContentTestDir createInstance() {
        return new ContentTestDir();
    }

    private ContentTestDir() {
        super(Paths.get(EnvVarConfig.getMentalizrContentTestDir()));
    }
}
