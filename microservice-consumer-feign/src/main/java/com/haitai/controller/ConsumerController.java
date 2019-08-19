package com.haitai.controller;

import com.haitai.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bin.wang
 */
@RestController
public class ConsumerController {
    @Autowired
    private SystemService systemService;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String getUserInfo() {
        return systemService.getInstanceId();
    }
}
