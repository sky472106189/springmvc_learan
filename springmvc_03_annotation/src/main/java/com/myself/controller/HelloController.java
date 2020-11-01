package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    //真实访问地址 : 项目名/hello/h1
    @RequestMapping("/h1")
    public String Method1(Model model){
        //封装数据
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC-annotation-method1");

        //WEB-INF/jsp/hello.jsp
        return "hello"; //返回视图逻辑名，交给视图解析器处理
    }

    //真实访问地址 : 项目名/hello/h1
    @RequestMapping("/h2")
    public String Method2(Model model){
        //封装数据
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC-annotation-method2");

        //WEB-INF/jsp/hello.jsp
        return "hello"; //返回视图逻辑名，交给视图解析器处理
    }

}
