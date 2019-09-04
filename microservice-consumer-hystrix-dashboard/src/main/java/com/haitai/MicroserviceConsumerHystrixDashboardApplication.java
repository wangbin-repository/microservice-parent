package com.haitai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class MicroserviceConsumerHystrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerHystrixDashboardApplication.class, args);
    }

}
