package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.container.TomcatContainerM7rHostConfigDir;

public class M7rInstanceConfigFile extends M7rFile {

    public static final String NAME = "m7r-instance.conf";

    public static M7rInstanceConfigFile createInstance() {
        return new M7rInstanceConfigFile();
    }

    private M7rInstanceConfigFile() {
        super(new TomcatContainerM7rHostConfigDir().asPath().resolve(NAME));
    }

    @Override
    public String getDescription() {
        return NAME + " file";
    }

}
