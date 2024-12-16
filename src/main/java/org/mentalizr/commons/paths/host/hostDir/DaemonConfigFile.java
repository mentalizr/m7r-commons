package org.mentalizr.commons.paths.host.hostDir;

import org.mentalizr.commons.paths.FileNames;
import org.mentalizr.commons.paths.M7rFile;
import org.mentalizr.commons.paths.M7rPaths;

public class DaemonConfigFile extends M7rFile {

    public DaemonConfigFile() {
        super(new DaemonDir(), FileNames.DAEMON_CONF);
    }

}
