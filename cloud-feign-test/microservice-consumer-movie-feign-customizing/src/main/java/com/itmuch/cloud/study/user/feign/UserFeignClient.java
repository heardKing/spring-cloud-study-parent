package com.itmuch.cloud.study.user.feign;

import com.itmuch.cloud.config.FeignConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.itmuch.cloud.study.user.entity.User;

/**
 * 使用 @FeignClient 的 configuration 属性, 指定 feign 的配置类
 */
@FeignClient(name = "micro-service-provider-user",configuration = FeignConfiguration.class)
public interface UserFeignClient {

  /**
   * 使用 feign 自带的注解 @RequestLine
   * @see https://github.com/OpenFeign/feign
   * @param id 用户 id
   * @return 用户信息
   */
  @RequestLine("GET /{id}")
  User findById(@Param("id") Long id);

}
