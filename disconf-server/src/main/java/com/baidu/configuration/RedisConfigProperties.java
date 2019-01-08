package com.baidu.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiangzhurui
 * @version 2018-12-10 15:01
 */
@Data
@Configuration
@EnableConfigurationProperties(RedisConfigProperties.class)
@ConfigurationProperties(prefix = "redis")
public class RedisConfigProperties {

    public static class Group1 {
       private Integer retryTimes;
    }

    @Data
    public static class Evictor {
        private String delayCheckSeconds;
        private String checkPeriodSeconds;
        private String failedTimesToBeTickOut;
    }


}
