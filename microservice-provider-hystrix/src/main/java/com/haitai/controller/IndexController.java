package com.haitai.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public String getInstanceId(@PathVariable("num") String num) {
        int i = Integer.parseInt(num);
        return instanceId.toString() + " ->num = " + i;
    }

    public String processHystrix_Get(@PathVariable("num") String num) {
        return instanceId.toString() + " ->" + num + "不是数字类型，无法转换";
    }
}
