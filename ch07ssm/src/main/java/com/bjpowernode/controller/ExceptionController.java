package com.bjpowernode.controller;

import com.bjpowernode.exception.AgeException;
import com.bjpowernode.exception.NameException;
import com.bjpowernode.exception.UserException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.naming.Name;

@Controller
public class ExceptionController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(String tname,Integer tage) throws UserException {
        ModelAndView mv=new ModelAndView();
        mv.addObject("myname",tname);
        mv.addObject("myage",tage);

        mv.setViewName("result");
        if(!"zs".equals(tname)){
            throw new NameException("姓名不正确");
        }

        if(tage==null || tage>80){
            throw new AgeException("年龄不正确");
        }
        return mv;
    }
}
