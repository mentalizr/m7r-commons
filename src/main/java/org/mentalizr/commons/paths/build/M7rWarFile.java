package org.mentalizr.commons.paths.build;

import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.host.hostDir.M7rInfraConfigDir;

public class M7rWarFile extends M7rFile {

    public static final String NAME = "m7r.war";

    public static M7rWarFile createInstance() {
        return new M7rWarFile();
    }

    private M7rWarFile() {
        super(new BackendDir().asPath().resolve("build/libs/" + NAME));
    }

}
