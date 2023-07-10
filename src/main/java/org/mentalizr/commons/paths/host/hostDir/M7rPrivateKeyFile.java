package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rPrivateKeyFile extends M7rFile {

    public M7rPrivateKeyFile() {
        super(new CertsDir(),"private.key");
    }

    @Override
    public String getDescription() {
        return "SSL private key file";
    }

}
