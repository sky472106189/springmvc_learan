package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //原来：   http://localhost:8080/add?a=1&b=2
    //RestFul: http://localhost:8080/add/1/s

    @RequestMapping(value = "/add/{a}/{b}")
    public String test01(@PathVariable int a, @PathVariable String b, Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }

    @RequestMapping(value = "/post/{a}/{b}",method = {RequestMethod.GET})
    public String test02(@PathVariable int a,@PathVariable String b,Model model){
        String res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}
