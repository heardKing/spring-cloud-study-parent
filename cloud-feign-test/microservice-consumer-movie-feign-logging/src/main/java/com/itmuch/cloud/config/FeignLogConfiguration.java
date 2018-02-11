package com.itmuch.cloud.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignLogConfiguration {

    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }

}
