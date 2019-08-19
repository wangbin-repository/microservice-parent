package com.haitai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: bin.wang
 */
@FeignClient(value = "MICROSERVICE-PROVIDER-SYSTEM")
public interface SystemService {
    @RequestMapping(value = "/getInstanceId", method = RequestMethod.GET)
    String getInstanceId();
}
