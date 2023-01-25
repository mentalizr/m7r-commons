package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rInstanceConfigFile extends M7rFile {

    public static final String NAME = "m7r-instance.conf";

    public static M7rInstanceConfigFile createInstance() {
        return new M7rInstanceConfigFile();
    }

    private M7rInstanceConfigFile() {
        super(M7rHostConfigDir.createInstance().asPath().resolve(NAME));
    }

    @Override
    public String getDescription() {
        return NAME + " file";
    }

}
