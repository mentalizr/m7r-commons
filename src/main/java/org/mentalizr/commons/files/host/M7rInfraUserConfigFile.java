package org.mentalizr.commons.files.host;

import org.mentalizr.commons.dirs.host.M7rInfraConfigDir;
import org.mentalizr.commons.files.M7rFile;

public class M7rInfraUserConfigFile extends M7rFile {

    public static final String NAME = "m7r-infra-user.conf";

    public static M7rInfraUserConfigFile createInstance() {
        return new M7rInfraUserConfigFile();
    }

    private M7rInfraUserConfigFile() {
        super(M7rInfraConfigDir.createInstance().asPath().resolve(NAME));
    }

}
