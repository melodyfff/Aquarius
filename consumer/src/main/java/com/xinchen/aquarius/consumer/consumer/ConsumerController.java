package com.xinchen.aquarius.consumer.consumer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/5 20:15
 */
@RestController
public class ConsumerController {

    private HomeClient homeClient;

    public ConsumerController(HomeClient homeClient) {
        this.homeClient = homeClient;
    }

    @GetMapping("/hello")
    public String hello(){
        return homeClient.consumer();
    }

}
