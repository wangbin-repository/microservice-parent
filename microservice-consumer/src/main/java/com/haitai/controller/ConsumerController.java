package com.haitai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: bin.wang
 */
@RestController
public class ConsumerController {
    private static final String REST_URI_PREFIX = "http://MICROSERVICE-PROVIDER-SYSTEM";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String getUserInfo() {
        return restTemplate.getForObject(REST_URI_PREFIX + "/getInstanceId", String.class);
    }
}
