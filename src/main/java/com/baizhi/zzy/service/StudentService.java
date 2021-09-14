package com.baizhi.zzy.service;

import com.baizhi.zzy.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> queryAllStudent();
    public void deleteById(Integer id);
}
