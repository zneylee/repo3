package com.bjpowernode.controller;

import com.bjpowernode.domain.Student;
import com.bjpowernode.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/addStudent.do")
    public ModelAndView  addStudent(Student student){
        ModelAndView mv = new ModelAndView();
        String tips="注册失败";
        //调用service处理student
        int nums=studentService.addStudent(student);
        if(nums >0){
            tips="学生["+student.getName()+"]注册成功";
        }
        //添加数据
        mv.addObject("tips",tips);

        mv.setViewName("result");
        return mv;
    }
//    @RequestMapping(value = "selectStudent.do")
//    public ModelAndView selectStudent(){
//        ModelAndView mv=new ModelAndView();
//        List<Student> student = studentService.findStudent();
//
//        if(student!=null){
//            mv.addObject("student",student);
//        }
//        mv.setViewName("result");
//        return mv;
//    }
    @RequestMapping(value = "/queryStudent.do")
    @ResponseBody
    public List<Student> queryStudent(){
        List<Student> student = studentService.findStudent();

        return student;
    }
}
