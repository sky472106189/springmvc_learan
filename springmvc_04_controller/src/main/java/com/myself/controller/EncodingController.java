package com.myself.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EncodingController {

    @PostMapping("/encoding")
    public String test1(String name,Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
