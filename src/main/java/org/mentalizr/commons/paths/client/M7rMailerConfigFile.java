package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rFile;

public class M7rMailerConfigFile extends M7rFile {

    public static M7rMailerConfigFile createInstance() {
        return new M7rMailerConfigFile();
    }

    private M7rMailerConfigFile() {
        super(M7rClientCliDir.createInstance().resolve("mailer.config"));
    }

    @Override
    public String getDescription() {
        return "m7r mailer.config file";
    }

}
