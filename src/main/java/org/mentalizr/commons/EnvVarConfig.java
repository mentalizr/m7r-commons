package org.mentalizr.commons;

public class EnvVarConfig {

    public static final String MENTALIZR_DIR = "MENTALIZR_DIR";
    public static final String MENTALIZR_GITREPOS = "MENTALIZR_GITREPOS";
    public static final String MENTALIZR_INSTANCE_CONFIG = "MENTALIZR_INSTANCE_CONFIG";

    private static final String M7R_DIR_DEFAULT = System.getProperty("user.home") + "/" +".m7r";
    private static final String M7R_GITREPOS_DEFAULT = System.getProperty("user.home") + "/gitrepos/m7r";

    public static boolean hasEnvVarMentalizrDir() {
        return System.getenv(MENTALIZR_DIR) != null;
    }

    public static String getMentalizrDir() {
        return hasEnvVarMentalizrDir() ? System.getenv(MENTALIZR_DIR) : M7R_DIR_DEFAULT;
    }

    public static boolean hasEnvVarMentalizrGitRepos() {
        return System.getenv(MENTALIZR_GITREPOS) != null;
    }

    public static String getMentalizrGitRepos() {
        return hasEnvVarMentalizrGitRepos() ? System.getenv(MENTALIZR_GITREPOS) : M7R_GITREPOS_DEFAULT;
    }

//    public static boolean hasEnvVarMentalizrInstanceConfig() {
//        return System.getenv(MENTALIZR_INSTANCE_CONFIG) != null;
//    }
//
//    public static String getMentalizrInstanceConfig() {
//        if (!hasEnvVarMentalizrInstanceConfig())
//            throw new IllegalStateException(MENTALIZR_INSTANCE_CONFIG + " not specified. Check before calling.");
//        return System.getenv(MENTALIZR_INSTANCE_CONFIG);
//    }

}
