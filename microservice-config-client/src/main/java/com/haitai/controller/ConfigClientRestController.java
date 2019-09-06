package com.haitai.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bin.wang
 */
@RestController
public class ConfigClientRestController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/clientConfig")
    public String getConfig()
    {
        String str = "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
        return "applicationName: " + applicationName + "\t eurekaServers:" + eurekaServers + "\t port: " + port;
    }
}
