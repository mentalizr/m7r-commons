package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rInstanceConfigFile extends M7rFile {

    public M7rInstanceConfigFile() {
        super(M7rPaths.getM7rHostConfigDir(), FileNames.M7R_INSTANCE_CONF);
    }

}
