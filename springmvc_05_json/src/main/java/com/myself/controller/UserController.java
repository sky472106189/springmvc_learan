package com.myself.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myself.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {

    @RequestMapping(value = "/j1")
    @ResponseBody//这行注解代表：它不会走视图解析器，会直接返回一个字符串
    public String json1() throws JsonProcessingException {

        //创建一个jackson的对象映射器，用来解析数据
        ObjectMapper mapper = new ObjectMapper();

        //创建对象
        User user = new User("张三",3,"男");
        //将我们的对象解析成为json格式
        String str = mapper.writeValueAsString(user);
        //由于@ResponseBody注解，这里会将str转成json格式返回；十分方便
        return str;
    }

    @RequestMapping(value = "/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        User user1 = new User("张三",3,"男");
        User user2 = new User("李四",4,"男");
        User user3 = new User("王五",5,"男");
        User user4 = new User("老六",6,"男");
        User user5 = new User("大七",7,"男");

        List<User> list = new ArrayList<User>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);

        String str = mapper.writeValueAsString(list);
        return str;
    }

    @RequestMapping(value = "/j3")
    @ResponseBody
    public String json3() throws JsonProcessingException {

        ObjectMapper mapper = new ObjectMapper();

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");

        String str = mapper.writeValueAsString(sdf.format(date));
        return str;
    }
}
