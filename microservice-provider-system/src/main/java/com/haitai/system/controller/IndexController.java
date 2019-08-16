package com.haitai.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bin.wang
 */
@RestController
public class IndexController {
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/getDiscoveryClient", method = RequestMethod.GET)
    public Object getDiscoveryClient() {
        return discoveryClient;
    }
}
