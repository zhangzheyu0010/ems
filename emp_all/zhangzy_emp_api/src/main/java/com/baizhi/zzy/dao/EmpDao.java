package com.baizhi.zzy.dao;

import com.baizhi.zzy.entity.Emp;

import java.util.List;

public interface EmpDao {
    public List<Emp> queryAll();
    public void delete(Integer id);
    public void insert(Emp emp);
    public void update(Emp emp);
    public Emp queryOne(Integer id);
}
