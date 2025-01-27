package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;

public class SchedulerConfigFile extends M7rFile {

    public SchedulerConfigFile() {
        super(new SchedulerDir(), FileNames.SCHEDULER_CONF);
    }

}
