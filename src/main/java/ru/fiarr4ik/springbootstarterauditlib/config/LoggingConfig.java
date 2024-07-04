package ru.fiarr4ik.springbootstarterauditlib.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

    /**
     * Главный конфиг со сканом директорий и собственным префиксом для настройки.
     */
    @Configuration
    @ConfigurationProperties(prefix = "auditlog")
    @ComponentScan(basePackages = "ru.fiarr4ik.springbootstarterauditlib")
    public class LoggingConfig {
        private boolean consoleEnabled;
        private boolean fileEnabled;
        private String filePath;

        public boolean isConsoleEnabled() {
            return consoleEnabled;
        }

        public void setConsoleEnabled(boolean consoleEnabled) {
            this.consoleEnabled = consoleEnabled;
        }

        public boolean isFileEnabled() {
            return fileEnabled;
        }

        public void setFileEnabled(boolean fileEnabled) {
            this.fileEnabled = fileEnabled;
        }

        public String getFilePath() {
            return filePath;
        }

        public void setFilePath(String filePath) {
            this.filePath = filePath;
        }
    }
