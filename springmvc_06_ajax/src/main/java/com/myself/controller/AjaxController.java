package com.myself.controller;

import com.myself.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController//绕过视图解析器，只传递字符串
public class AjaxController {

    @RequestMapping("/a1")
    public void ajax1(String name, HttpServletResponse response) throws IOException {
        if ("ciweiyu".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> ajax2(){
        List<User> list = new ArrayList<User>();
        list.add(new User("刺猬1号",3,"男"));
        list.add(new User("刺猬2号",3,"男"));
        list.add(new User("刺猬3号",3,"男"));
        return list; //由于@RestController注解，将list转成json格式返回
    }
}

