package com.haitai.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceProviderSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProviderSystemApplication.class, args);
    }

}
