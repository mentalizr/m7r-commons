package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;

public class M7rIntentionFile extends M7rFile {

    public M7rIntentionFile() {
        super(new M7rHostRunDir(), FileNames.INFRA_INTENTION_FILE);
    }

}
