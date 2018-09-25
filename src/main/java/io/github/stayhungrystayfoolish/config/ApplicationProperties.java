package io.github.stayhungrystayfoolish.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Oss Service.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

    private Oss oss;

    public static class Oss {

        private String type;

        private ALiYun aLiYun;

        private Aws aws;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public ALiYun getaLiYun() {
            return aLiYun;
        }

        public void setaLiYun(ALiYun aLiYun) {
            this.aLiYun = aLiYun;
        }

        public Aws getAws() {
            return aws;
        }

        public void setAws(Aws aws) {
            this.aws = aws;
        }

        public static class ALiYun {
            private String accessKey;
            private String secretKey;
            private String endpoint;
            private String bucket;
            private String aliPackage;

            public String getAccessKey() {
                return accessKey;
            }

            public void setAccessKey(String accessKey) {
                this.accessKey = accessKey;
            }

            public String getSecretKey() {
                return secretKey;
            }

            public void setSecretKey(String secretKey) {
                this.secretKey = secretKey;
            }

            public String getEndpoint() {
                return endpoint;
            }

            public void setEndpoint(String endpoint) {
                this.endpoint = endpoint;
            }

            public String getBucket() {
                return bucket;
            }

            public void setBucket(String bucket) {
                this.bucket = bucket;
            }

            public String getAliPackage() {
                return aliPackage;
            }

            public void setAliPackage(String aliPackage) {
                this.aliPackage = aliPackage;
            }
        }

        public static class Aws {
            private String awsAccessId;
            private String awsSecretKey;
            private String awsBucket;
            private String awsPackage;

            public String getAwsAccessId() {
                return awsAccessId;
            }

            public void setAwsAccessId(String awsAccessId) {
                this.awsAccessId = awsAccessId;
            }

            public String getAwsSecretKey() {
                return awsSecretKey;
            }

            public void setAwsSecretKey(String awsSecretKey) {
                this.awsSecretKey = awsSecretKey;
            }

            public String getAwsBucket() {
                return awsBucket;
            }

            public void setAwsBucket(String awsBucket) {
                this.awsBucket = awsBucket;
            }

            public String getAwsPackage() {
                return awsPackage;
            }

            public void setAwsPackage(String awsPackage) {
                this.awsPackage = awsPackage;
            }
        }
    }

    public Oss getOss() {
        return oss;
    }

    public void setOss(Oss oss) {
        this.oss = oss;
    }
}
