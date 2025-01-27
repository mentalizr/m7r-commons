package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;

public class M7rSchedulerPidFile extends M7rFile {

    public M7rSchedulerPidFile() {
        super(new M7rHostRunDir(), FileNames.SCHEDULER_PID);
    }

}
