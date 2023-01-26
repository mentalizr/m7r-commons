package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.container.TomcatContainerM7rHostConfigDir;

public class M7rInfraUserConfigFile extends M7rFile {

    public static final String NAME = "m7r-infra-user.conf";

    public static M7rInfraUserConfigFile createInstance() {
        return new M7rInfraUserConfigFile();
    }

    private M7rInfraUserConfigFile() {
        super(new TomcatContainerM7rHostConfigDir().asPath().resolve(NAME));
    }

    @Override
    public String getDescription() {
        return NAME + " file";
    }

}
