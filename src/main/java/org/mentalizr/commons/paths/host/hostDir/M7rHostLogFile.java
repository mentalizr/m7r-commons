package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rHostLogFile extends M7rFile {

    public static M7rHostLogFile createInstance() {
        return new M7rHostLogFile();
    }

    private M7rHostLogFile() {
        super(M7rHostLogDir.createInstance().asPath().resolve("m7r-infra.log"));
    }

    @Override
    public String getDescription() {
        return "m7r infra log file";
    }

}
