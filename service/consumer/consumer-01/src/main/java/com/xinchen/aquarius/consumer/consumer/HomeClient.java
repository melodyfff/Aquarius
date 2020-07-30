package com.xinchen.aquarius.consumer.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/5 20:13
 */
@FeignClient(value = "provider-server",fallbackFactory = HystrixClientFallbackFactory.class)
public interface HomeClient {

    @GetMapping("/")
    String consumer();
}
