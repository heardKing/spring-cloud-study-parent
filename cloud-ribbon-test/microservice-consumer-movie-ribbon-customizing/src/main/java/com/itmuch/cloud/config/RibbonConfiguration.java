package com.itmuch.cloud.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 该类为Ribbon的配置类
 * 注意: 该类不应该在主应用程序上下文的@ComponentScan 中.
 * @author cuixx
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        // 负载均衡规则, 改为随机
        return new RandomRule();
    }

}
