package com.myself.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//测试拦截器的控制器
@RestController
public class InterceptorController {

    @RequestMapping("/interceptor")
    public String testFunction() {
        System.out.println("控制器中的方法执行了");
        return "hello";
    }
}
