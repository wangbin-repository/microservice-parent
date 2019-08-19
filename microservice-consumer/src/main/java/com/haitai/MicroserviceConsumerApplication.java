package com.haitai;

import com.ribbon.CustomRuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
/*在启动该微服务的时候加载自定义的Ribbon配置类，从而按照MyRule定义的负责均衡算法访问MICROSERVICE-PROVIDER-SYSTEM服务*/
@RibbonClient(name = "MICROSERVICE-PROVIDER-SYSTEM", configuration = CustomRuleConfiguration.class)
public class MicroserviceConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceConsumerApplication.class, args);
    }

}
