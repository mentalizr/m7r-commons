package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;

public class M7rDaemonActiveFlagFile extends M7rFile {

    public M7rDaemonActiveFlagFile() {
        super(new M7rDaemonConfigDir(), FileNames.DAEMON_ACTIVE_FLAG_FILE);
    }

}
