package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.M7rPaths;

public class M7rDaemonPidFile extends M7rFile {

    public M7rDaemonPidFile() {
        super(new M7rHostRunDir(), FileNames.DAEMON_PID);
    }

}
