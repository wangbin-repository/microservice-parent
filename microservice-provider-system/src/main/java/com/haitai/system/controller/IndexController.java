package com.haitai.system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bin.wang
 */
@RestController
public class IndexController {
    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @RequestMapping(value = "/getInstanceId", method = RequestMethod.GET)
    public String getInstanceId() {
        return instanceId;
    }
}
