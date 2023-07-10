package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rSslCertFile extends M7rFile {

    public M7rSslCertFile() {
        super(new CertsDir(),"domain.crt");
    }

    @Override
    public String getDescription() {
        return "SSL certificate file";
    }

}
