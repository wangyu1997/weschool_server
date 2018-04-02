package com.njtech.weschool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WeschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(WeschoolApplication.class, args);
    }
}
