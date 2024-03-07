package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rFile;

public class M7rClientCliConfigFile extends M7rFile {

    public static M7rClientCliConfigFile createInstance() {
        return new M7rClientCliConfigFile();
    }

    private M7rClientCliConfigFile() {
        super(M7rClientCliDir.createInstance().asPath().resolve("cli.config"));
    }

    @Override
    public String getDescription() {
        return "m7r cli.config file";
    }

}
