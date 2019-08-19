package com.haitai.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: bin.wang
 */
@Configuration
public class RibbonConfig {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule() {

        /*轮询(默认)*/
//        return new RoundRobinRule();

        /*随机*/
//        return new RandomRule();

        /*会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，还有并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问*/
//        return new AvailabilityFilteringRule();

        /*根据平均响应时间计算所有服务的权重，响应时间越快服务权重越大被选中的概率越高。刚启动时如果统计信息不足，则使用RoundRobinRule策略，等统计信息足够，会切换到WeightedResponseTimeRule*/
//        return new WeightedResponseTimeRule();

        /*先按照RoundRobinRule策略获取服务，如果获取服务失败则在指定时间内进行重试，获取可用的服务*/
//        return new RetryRule();

        /*会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务，然后选择一个并发数量最小的服务*/
//        return new BestAvailableRule();

        /*默认规则，复合判断server所在区域的性能和server的可用性选择服务器*/
//        return new ZoneAvoidanceRule();
//    }
}
