package com.haitai.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: bin.wang
 */
//@FeignClient(value = "MICROSERVICE-PROVIDER-SYSTEM")
@FeignClient(value = "MICROSERVICE-PROVIDER-SYSTEM", fallbackFactory = SystemServiceFallbackFactory.class)
public interface SystemService {
    @RequestMapping(value = "/getInstanceId/{num}", method = RequestMethod.GET)
    String getInstanceId(@PathVariable("num") String num);
}
