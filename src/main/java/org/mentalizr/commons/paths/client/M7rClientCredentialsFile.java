package org.mentalizr.commons.paths.client;

import org.mentalizr.commons.paths.M7rFile;

public class M7rClientCredentialsFile extends M7rFile {

    public static M7rClientCredentialsFile createInstance() {
        return new M7rClientCredentialsFile();
    }

    private M7rClientCredentialsFile() {
        super(M7rClientCliDir.createInstance().asPath().resolve("credentials.txt"));
    }

    @Override
    public String getDescription() {
        return "m7r cli credentials file";
    }

}
