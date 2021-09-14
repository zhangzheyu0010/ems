package com.baizhi.zzy.service;

import com.baizhi.zzy.entity.Emp;

import java.util.List;

public interface EmpService {
    public List<Emp> queryAllStudent();
    public Emp queryOneStudent(Integer id);
    public void insertStudent(Emp emp);
    public void updateStudent(Emp emp);
    public void deleteStudent(Integer id);
}
