package com.example.dubboconsumerdemo;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lizhaoteng
 */
@DubboComponentScan(value ="com.example.dubboconsumerdemo.study.controller.HelloController")
@SpringBootApplication
public class DubboConsumerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerDemoApplication.class, args);
    }
}
