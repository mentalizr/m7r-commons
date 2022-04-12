package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rCicdLogFile extends M7rFile {

    public static M7rCicdLogFile createInstance() {
        return new M7rCicdLogFile();
    }

    private M7rCicdLogFile() {
        super(M7rHostLogDir.createInstance().asPath().resolve("m7r-cicd.log"));
    }

    @Override
    public String getDescription() {
        return "m7r CICD log file";
    }

}
