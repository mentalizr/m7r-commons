package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rInfraUserConfigFile extends M7rFile {

    public static final String NAME = "m7r-infra-user.conf";

    public static M7rInfraUserConfigFile createInstance() {
        return new M7rInfraUserConfigFile();
    }

    private M7rInfraUserConfigFile() {
        super(M7rHostConfigDir.createInstance().asPath().resolve(NAME));
    }

    @Override
    public String getDescription() {
        return "m7r-infra-user.conf file";
    }

}
