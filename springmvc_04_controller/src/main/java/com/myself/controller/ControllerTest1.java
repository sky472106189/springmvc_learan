package com.myself.controller;


import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ControllerTest1 implements Controller{

    @Nullable
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView mw = new ModelAndView();
        mw.addObject("msg","ControllerTest1,缺点是只能写一个方法");
        mw.setViewName("test");

        return mw;
    }
}
