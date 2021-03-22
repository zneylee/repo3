package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/user")
@Controller
public class InterceptorController {
    @RequestMapping("/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("infomation","i am dosome");

        mv.setViewName("result");
        return mv;
    }
}
