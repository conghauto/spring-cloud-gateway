package com.cls.gateway.discoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ClsGatewayDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClsGatewayDiscoveryServiceApplication.class, args);
    }

}
