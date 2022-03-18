package org.mentalizr.commons;

public class EnvVarConfig {

    public static final String MENTALIZR_HOST_DIR = "MENTALIZR_HOST_DIR";
    private static final String MENTALIZR_HOST_DIR_DEFAULT = System.getProperty("user.home") + "/" +".m7r-host/";

    public static final String MENTALIZR_CLIENT_DIR = "MENTALIZR_CLIENT_DIR";
    private static final String MENTALIZR_CLIENT_DIR_DEFAULT = System.getProperty("user.home") + "/" +".m7r/";

    public static final String MENTALIZR_GIT_REPOS_DIR = "MENTALIZR_GIT_REPOS_DIR";
    private static final String MENTALIZR_GIT_REPOS_DIR_DEFAULT = System.getProperty("user.home") + "/gitrepos/m7r/";

    public static final String MENTALIZR_CONTENT_DIR = "MENTALIZR_CONTENT_DIR";
    private static final String MENTALIZR_CONTENT_DIR_DEFAULT = System.getProperty("user.home") + "/gitrepos/m7r/content/";

    public static boolean hasEnvVarMentalizrHostDir() {
        return System.getenv(MENTALIZR_HOST_DIR) != null;
    }

    public static String getMentalizrHostDir() {
        return hasEnvVarMentalizrHostDir() ?
                System.getenv(MENTALIZR_HOST_DIR) : MENTALIZR_HOST_DIR_DEFAULT;
    }

    public static boolean hasEnvVarMentalizrClientDir() {
        return System.getenv(MENTALIZR_CLIENT_DIR) != null;
    }

    public static String getMentalizrClientDir() {
        return hasEnvVarMentalizrClientDir() ?
                System.getenv(MENTALIZR_CLIENT_DIR) : MENTALIZR_CLIENT_DIR_DEFAULT;
    }

    public static boolean hasEnvVarGitReposDir() {
        return System.getenv(MENTALIZR_GIT_REPOS_DIR) != null;
    }

    public static String getMentalizrGitReposDir() {
        return hasEnvVarGitReposDir() ?
                System.getenv(MENTALIZR_GIT_REPOS_DIR) : MENTALIZR_GIT_REPOS_DIR_DEFAULT;
    }

    public static boolean hasEnvVarContentDir() {
        return System.getenv(MENTALIZR_CONTENT_DIR) != null;
    }

    public static String getMentalizrContentDir() {
        return hasEnvVarContentDir() ?
                System.getenv(MENTALIZR_CONTENT_DIR) : MENTALIZR_CONTENT_DIR_DEFAULT;
    }

}
