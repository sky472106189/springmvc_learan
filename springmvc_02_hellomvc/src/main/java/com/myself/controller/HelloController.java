package com.myself.controller;


import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements org.springframework.web.servlet.mvc.Controller{
    @Nullable
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mv = new ModelAndView();

        //业务代码
        String result = "HelloSpringMVC";
        mv.addObject("msg",result);

        //视图 跳转给视图解析器InternalResourceViewResolver
        mv.setViewName("hellomvc");//WEB-INF/jsp/hellomvc.jsp

        return mv;
    }
}
