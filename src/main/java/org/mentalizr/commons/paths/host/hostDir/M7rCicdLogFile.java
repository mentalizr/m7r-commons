package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rCicdLogFile extends M7rFile {

    public M7rCicdLogFile() {
        super(M7rPaths.getM7rHostDir(), FileNames.CICD_LOG_FILE);
    }

    @Override
    public String getDescription() {
        return "m7r CICD log file";
    }

}
