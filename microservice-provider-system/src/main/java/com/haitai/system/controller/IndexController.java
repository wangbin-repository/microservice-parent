package com.haitai.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: bin.wang
 * @CreateDate: 2019/8/15 18:05
 * @Version: 1.0
 * @Copyright: Copyright (c) 2019 haitai
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
