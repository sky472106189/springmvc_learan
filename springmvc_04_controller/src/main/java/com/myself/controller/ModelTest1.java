package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {

    @RequestMapping("/model/t1")
    public String test1(Model model){
        model.addAttribute("msg","不用视图解析器的方式——1");
        //转发
        return "/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/model/t2")
    public String test2(Model model){
        model.addAttribute("msg","不用视图解析器的方式——2");
        //转发2
        return "forward:/WEB-INF/jsp/test.jsp";
    }

    @RequestMapping("/model/t3")
    public String test3(Model model){
        model.addAttribute("msg","asd");
        //重定向
        return "redirect:/index.jsp";
    }

    @RequestMapping("/model/t4")
    public String test4(Model model){
        model.addAttribute("msg","asd");
        //有视图解析器的情况下——重定向
        return "redirect:/index.jsp";
    }
    @RequestMapping("/model/t5")
    public String test5(Model model){
        model.addAttribute("msg","asd");
        //有视图解析器的情况下——转发
        return "test";
    }
}
