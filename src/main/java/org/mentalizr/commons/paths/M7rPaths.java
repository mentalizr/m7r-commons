package org.mentalizr.commons.paths;

import org.mentalizr.commons.paths.host.hostDir.M7rHostConfigDir;
import org.mentalizr.commons.paths.host.hostDir.M7rHostDir;
import org.mentalizr.commons.paths.host.hostDir.M7rHostLogDir;
import org.mentalizr.commons.paths.host.hostDir.M7rInfraUserConfigFile;

public class M7rPaths {
    
    private static M7rHostDir m7rHostDir = null;
    private static M7rHostConfigDir m7rHostConfigDir = null;
    private static M7rInfraUserConfigFile m7rInfraUserConfigFile = null;
    private static M7rHostLogDir m7rHostLogDir = null;

    
    public static M7rHostDir getM7rHostDir() {
        if (m7rHostDir == null)
            m7rHostDir = new M7rHostDir();
        return m7rHostDir;
    }

    public static M7rHostConfigDir getM7rHostConfigDir() {
        if (m7rHostConfigDir == null)
            m7rHostConfigDir = new M7rHostConfigDir();
        return m7rHostConfigDir;
    } 
    
    public static M7rInfraUserConfigFile getM7rInfraUserConfigFile() {
        if (m7rInfraUserConfigFile == null)
            m7rInfraUserConfigFile = new M7rInfraUserConfigFile();
        return m7rInfraUserConfigFile;
    }

    public static M7rHostLogDir getM7rHostLogDir() {
        if (m7rHostLogDir == null)
            m7rHostLogDir = new M7rHostLogDir();
        return m7rHostLogDir;
    }
    
}
