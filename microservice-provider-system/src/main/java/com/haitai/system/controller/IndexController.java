package com.haitai.system.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping(value = "/getInstanceId/{num}", method = RequestMethod.GET)
    public String getInstanceId(@PathVariable("num") String num) {
        int i = Integer.parseInt(num);
        return instanceId.toString() + " ->num = " + i;
    }
}
