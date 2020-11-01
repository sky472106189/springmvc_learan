package com.myself.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest2 {

    @RequestMapping("/h1")
    public String method1(Model model){
        model.addAttribute("msg","annotation-method1");
        return "test"; //WEB-INF/jsp/test.jsp
    }

    @RequestMapping("/h2")
    public String method2(Model model){
        model.addAttribute("msg","annotation-method2");
        return "test";
    }
}
