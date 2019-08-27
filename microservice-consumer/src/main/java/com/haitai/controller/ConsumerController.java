package com.haitai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: bin.wang
 */
@RestController
public class ConsumerController {
    private static final String REST_URI_PREFIX = "http://MICROSERVICE-PROVIDER-HYSTRIX";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer/{num}", method = RequestMethod.GET)
    public String getUserInfo(@PathVariable("num") String num) {
        return restTemplate.getForObject(REST_URI_PREFIX + "/getInstanceId/{num}", String.class, num);
    }
}
