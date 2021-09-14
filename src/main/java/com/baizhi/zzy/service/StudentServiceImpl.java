package com.baizhi.zzy.service;

import com.baizhi.zzy.dao.StudentDao;
import com.baizhi.zzy.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> queryAllStudent() {
        List<Student> list=studentDao.queryAll();
        return list;
    }

    @Override
    public void deleteById(Integer id) {
        studentDao.deleteStudent(id);
    }
}
