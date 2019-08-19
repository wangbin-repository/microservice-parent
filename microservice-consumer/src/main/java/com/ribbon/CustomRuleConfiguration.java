package com.ribbon;

import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: bin.wang
 */
@Configuration
public class CustomRuleConfiguration {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new CustomRandomRule();
    }
}
