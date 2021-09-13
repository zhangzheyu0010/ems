package com.baizhi.zzy.controller;

import com.baizhi.zzy.entity.Student;
import com.baizhi.zzy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("stu")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @RequestMapping("getstu")
    @ResponseBody
    public List<Student> queryAll(){
        List<Student> list=studentService.queryAllStudent();
        return list;
    }
    @RequestMapping("delstu")
    @ResponseBody
    public void delete(Integer id){
        studentService.deleteById(id);
    }
}
