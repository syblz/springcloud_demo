package com.innjoy.sun.enreka_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EnrekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnrekaClientApplication.class, args);
    }

}
