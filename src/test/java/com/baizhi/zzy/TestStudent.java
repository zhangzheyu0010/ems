package com.baizhi.zzy;

import com.baizhi.zzy.entity.Student;
import com.baizhi.zzy.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = AxiosApplication.class)
@RunWith(SpringRunner.class)
public class TestStudent {
    @Autowired
    private StudentService studentService;
    @Test
    public void testQueryAll(){
        List<Student> list=studentService.queryAllStudent();
        for (Student student:list) {
            System.out.println("student = " + student);
        }
    }
    @Test
    public void testdelete(){
        studentService.deleteById(3);
    }
}
