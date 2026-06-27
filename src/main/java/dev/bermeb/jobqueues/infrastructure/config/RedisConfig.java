package dev.bermeb.jobqueues.infrastructure.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RedisConfig {

    private String streamName;
    private String groupName;
    private String consumerName;

}