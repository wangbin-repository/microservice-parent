package com.haitai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Author: bin.wang
 * @CreateDate: 2019/8/15 17:52
 * @Version: 1.0
 * @Copyright: Copyright (c) 2019 haitai
 */
@RestController
public class ConsumerController {
    private static final String REST_URI_PREFIX = "http://MICROSERVICE-PROVIDER-SYSTEM";
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String getUserInfo() {
        return restTemplate.getForObject(REST_URI_PREFIX + "/getDiscoveryClient", String.class);
    }
}
