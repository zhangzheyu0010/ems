package com.baizhi.zzy.service;

import com.baizhi.zzy.dao.EmpDao;
import com.baizhi.zzy.entity.Emp;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;
@Service
@Transactional
public class EmpServiceImpl implements EmpService{
    @Resource
    private EmpDao empDao;
    @Override
    @Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
    public List<Emp> queryAllStudent() {
        return empDao.queryAll();
    }

    @Override
    public Emp queryOneStudent(Integer id) {
       return empDao.queryOne(id);
    }

    @Override
    public void insertStudent(Emp emp) {
         empDao.insert(emp);
    }

    @Override
    public void updateStudent(Emp emp) {
        empDao.update(emp);
    }

    @Override
    public void deleteStudent(Integer id) {
        empDao.delete(id);
    }
}
