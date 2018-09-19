package com.example.dubboproviderdemo.study.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.example.service.impl.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author lizhaoteng
 * @date 2018/9/17
 **/
@Component
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "Hello_dif," + name;
    }
}
