package com.outdd.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.outdd"})
@EnableDiscoveryClient
public class AwmGatewayServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AwmGatewayServerApplication.class, args);
    }

}
