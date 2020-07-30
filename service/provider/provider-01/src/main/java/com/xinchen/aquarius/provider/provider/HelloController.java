package com.xinchen.aquarius.provider.provider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Xin Chen (xinchenmelody@gmail.com)
 * @version 1.0
 * @date Created In 2019/6/5 19:47
 */
@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String home(){
        return "Hello World! port: "+port;
    }
}
