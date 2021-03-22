package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardController {

    @RequestMapping(value = "/doForward.do")
    public ModelAndView doForward(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("message","doForward");

        mv.setViewName("forward:/WEB-INF/jsp/result.jsp");
        return mv;

    }
}
