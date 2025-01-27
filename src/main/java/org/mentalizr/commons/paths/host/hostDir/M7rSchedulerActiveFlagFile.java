package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;

public class M7rSchedulerActiveFlagFile extends M7rFile {

    public M7rSchedulerActiveFlagFile() {
        super(new M7rSchedulerConfigDir(), FileNames.SCHEDULER_ACTIVE_FLAG_FILE);
    }

}
