package com.baizhi.zzy.controller;

import com.baizhi.zzy.entity.Emp;
import com.baizhi.zzy.service.EmpService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("emp")
public class EmpController {
    @Resource
    private EmpService empService;
    @RequestMapping("queryall")
    public List<Emp> queryAll(){
        return empService.queryAllStudent();
    }
    @RequestMapping("delemp")
    public void delete(Integer id){
        empService.deleteStudent(id);
    }
    @RequestMapping("addemp")
    public void addEmp(@RequestBody Emp emp){
        empService.insertStudent(emp);
    }
    @RequestMapping("queryone")
        public Emp queryOne(Integer id){
        return empService.queryOneStudent(id);
    }
    @RequestMapping("update")
    public void update(@RequestBody  Emp emp){
        empService.updateStudent(emp);
    }
}
