package com.example.dubboconsumerdemo.study.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.service.impl.HelloService;
import lombok.NonNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lizhaoteng
 * @date 2018/9/18
 **/
@RestController
public class HelloController {

    @Reference
    HelloService helloService;

    @GetMapping("/hello")
    public String useHello() {
        return helloService.sayHello("Dubbo");
    }

}
