package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.M7rFile;

public class M7rSslCertFile extends M7rFile {

    public static M7rSslCertFile createInstance() {
        return new M7rSslCertFile();
    }

    private M7rSslCertFile() {
        super(CertsDir.createInstance().asPath().resolve("domain.crt"));
    }

    @Override
    public String getDescription() {
        return "SSL certificate file";
    }

}
