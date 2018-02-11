package com.itmuch.cloud.study.config;

import com.itmuch.cloud.config.RibbonConfiguration;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

/**
 * 使用 RibbonClient , 为特定name的Ribbon Client自定义配置
 * 使用@RibbonClient的configuration属性, 指定Ribbon的配置类.
 */
@Configuration
@RibbonClient(name = "micro-service-provider-user",configuration = RibbonConfiguration.class)
public class TestConfiguration {
}
