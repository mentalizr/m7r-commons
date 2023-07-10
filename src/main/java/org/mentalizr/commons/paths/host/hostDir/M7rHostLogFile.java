package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rHostLogFile extends M7rFile {

    public M7rHostLogFile() {
        super(M7rPaths.getM7rHostLogDir(), FileNames.INFRA_LOG_FILE);
    }

    @Override
    public String getDescription() {
        return "m7r infra log file";
    }

}
