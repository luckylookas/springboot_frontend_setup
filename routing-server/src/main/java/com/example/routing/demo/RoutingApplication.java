package com.example.routing.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@EnableConfigurationProperties
public class RoutingApplication {

    public static final String RESOURCES_FOLDER = "classpath:/META-INF/resources/";

    public static void main(String[] args) {
        SpringApplication.run(RoutingApplication.class, args);
    }

}
