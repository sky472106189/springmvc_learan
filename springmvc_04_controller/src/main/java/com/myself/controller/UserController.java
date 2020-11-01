package com.myself.controller;

import com.myself.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    public String test1(String name,Model model){
        //1.接受前端参数
        System.out.println("接收到的前端参数为:"+name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3.视图跳转
        return "test";
    }

    @GetMapping("/t2")
    public String test2(@RequestParam("username") String name, Model model){
        //1.接受前端参数
        System.out.println("接收到的前端参数为:"+name);
        //2.将返回的结果传递给前端
        model.addAttribute("msg",name);
        //3.视图跳转
        return "test";
    }

    //前端接受的是一个对象：id,name,age
    @GetMapping("/t3")
    public String test3(User user, Model model){
        System.out.println(user);
        model.addAttribute("msg",user);
        return "test";
    }

    @GetMapping("/t4")
    public String test4(@RequestParam("username") String name, ModelMap model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
}

