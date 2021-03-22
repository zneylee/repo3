package com.bjpowernode.handler;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NameException.class)
    public ModelAndView doNameException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("message2","姓名必须是zs");
        mv.addObject("ex",ex);
        mv.setViewName("NameError");
        return mv;
    }
    @ExceptionHandler(value = AgeException.class)
    public ModelAndView doAgeException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("message2","您的年龄不能大于80");
        mv.addObject("ex",ex);
        mv.setViewName("AgeError");
        return mv;
    }@ExceptionHandler()
    public ModelAndView doOtherException(Exception ex){
        ModelAndView mv=new ModelAndView();
        mv.addObject("message2","我是其他异常");
        mv.addObject("ex",ex);
        mv.setViewName("defaultError");
        return mv;
    }

}
