package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rPrivateKeyFile extends M7rFile {

    public static M7rPrivateKeyFile createInstance() {
        return new M7rPrivateKeyFile();
    }

    private M7rPrivateKeyFile() {
        super(CertsDir.createInstance().asPath().resolve("private.key"));
    }

    @Override
    public String getDescription() {
        return "SSL private key file";
    }

}
