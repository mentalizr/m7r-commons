package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;

public class M7rInfraConfigFile extends M7rFile {

    public M7rInfraConfigFile() {
        super(new M7rHostConfigDir(), FileNames.M7R_INFRA_CONF);
    }

}
