package com.baizhi.zzy;

import com.baizhi.zzy.dao.EmpDao;
import com.baizhi.zzy.entity.Emp;
import com.baizhi.zzy.entity.User;
import com.baizhi.zzy.service.EmpService;
import com.baizhi.zzy.service.UserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@SpringBootTest(classes = ZhangzyEmpApiApplication.class)
@RunWith(SpringRunner.class)
class ZhangzyEmpApiApplicationTests {
@Resource
private EmpService empService;
@Resource
private UserService userService;
    @Test
    void contextLoads() {
        List<Emp> list=empService.queryAllStudent();
        for (Emp emp:list) {
            System.out.println("emp = " + emp);
        }
    }
    @Test
    void queryOne(){
        Emp emp = empService.queryOneStudent(4);
        System.out.println("emp = " + emp);
    }
    @Test
    void insert(){
        Emp emp=new Emp(9,"hahaha",10,new Date(),"运城");
       empService.insertStudent(emp);
    }
    @Test
    void update(){
        Emp emp=new Emp(6,"lol",11,new Date(),"闻喜");
        empService.updateStudent(emp);
    }
    @Test
    void delete(){
        empService.deleteStudent(5);
    }
    @Test
    void queryUser(){
        User user=new User();
        userService.queryUser(user);
    }
    @Test
    void addUser(){
        User user=new User(3,"zhang","111111");
        userService.addUserService(user);
    }
}
