package com.haitai.service;

import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: bin.wang
 */
@Component
public class SystemServiceFallbackFactory implements FallbackFactory<SystemService> {
    @Override
    public SystemService create(Throwable throwable) {
        return new SystemService() {
            @Override
            public String getInstanceId(String num) {
                return num + "不是数字类型，无法转换，Consumer客户端提供的降级信息,此刻服务Provider已经关闭";
            }
        };
    }
}
