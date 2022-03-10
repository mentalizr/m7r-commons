package org.mentalizr.commons;

import de.arthurpicht.utils.io.nio2.FileUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class M7rDirs {

    private static final String CLI_DIR = "cli";
    private static final String BACKUP_DIR = "backup";
    private static final String INFRA_DIR = "infra";
    private static final String LOG_DIR = "log";
    private static final String MONGO_DIR = "mongo";
    private static final String TOMCAT_DIR = "tomcat";

    private static final String CREATE_DIR = "create";
    private static final String TEMP_DIR = "temp";
    private static final String CONFIG_FILE = "cli.config";

    private final Path m7rDir;
    private final Path m7rGitReposDir;
//    private final Path m7rInstanceConfigDir;

    public M7rDirs() {
        this.m7rDir = Paths.get(EnvVarConfig.getMentalizrDir());
        this.m7rGitReposDir = Paths.get(EnvVarConfig.getMentalizrGitRepos());
//        if (!EnvVarConfig.hasEnvVarMentalizrInstanceConfig())
//            throw new RuntimeException("Environment variable [" + EnvVarConfig.MENTALIZR_INSTANCE_CONFIG + "] not set.");
//        this.m7rInstanceConfigDir = Paths.get(EnvVarConfig.getMentalizrInstanceConfig());
    }

    public Path getM7rDir() {
        return this.m7rDir;
    }

    public boolean existsM7rDir() {
        return FileUtils.isExistingDirectory(this.m7rDir);
    }

    public Path getCliDir() {
        return this.m7rDir.resolve(CLI_DIR);
    }

    public boolean existsCliDir() {
        return FileUtils.isExistingDirectory(getCliDir());
    }

    public Path getBackupDir() {
        return this.m7rDir.resolve(BACKUP_DIR);
    }

    public boolean existsBackupDir() {
        return FileUtils.isExistingDirectory(getBackupDir());
    }

    public Path getInfraDir() {
        return this.m7rDir.resolve(INFRA_DIR);
    }

    public boolean existsInfraDir() {
        return FileUtils.isExistingDirectory(getInfraDir());
    }

    public Path getInfraDirLog() {
        return getInfraDir().resolve(LOG_DIR);
    }

    public boolean existsInfraDirLog() {
        return FileUtils.isExistingDirectory(getInfraDirLog());
    }

    public Path getInfraConfigDir() {
        return getInfraDir().resolve("config");
    }

    public boolean existsInfraConfigDir() {
        return FileUtils.isExistingDirectory(getInfraConfigDir());
    }

    public void create() throws IOException {
        Files.createDirectories(getInfraConfigDir());
    }

    public Path getMongoLogDir() {
        return getInfraDirLog().resolve(MONGO_DIR);
    }

    public boolean existsMongoLogDir() {
        return FileUtils.isExistingDirectory(getMongoLogDir());
    }

    public Path getTomcatLogDir() {
        return getInfraDirLog().resolve(TOMCAT_DIR);
    }

    public boolean existsTomcatLogDir() {
        return FileUtils.isExistingDirectory(getTomcatLogDir());
    }

//    public Path getInstanceConfigDir() {
//        return this.m7rInstanceConfigDir;
//    }

//    public boolean existsInstanceConfigDir() {
//        return FileUtils.isExistingDirectory(getInstanceConfigDir());
//    }

    public Path getGitReposDir() {
        return this.m7rGitReposDir;
    }

    public boolean existsGitReposDir() {
        return FileUtils.isExistingDirectory(getGitReposDir());
    }

}
