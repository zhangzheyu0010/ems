package com.baizhi.zzy.dao;

import com.baizhi.zzy.entity.Student;

import java.util.List;

public interface StudentDao {
    public List<Student> queryAll();
    public void deleteStudent(Integer id);
}
