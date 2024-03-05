package org.mentalizr.commons.paths.provisioning;

import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.client.M7rClientLogDir;

public class M7rDevVmLogFile extends M7rFile {

    public M7rDevVmLogFile() {
        super(M7rClientLogDir.createInstance(), "m7r-dev-vm.log");
    }

    @Override
    public String getDescription() {
        return "m7r provisioning log file";
    }

}
