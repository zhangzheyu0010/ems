package com.baizhi.zzy.service;

import com.baizhi.zzy.dao.UserDao;
import com.baizhi.zzy.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;
    @Override
    public int queryUser(User user) {
        User user1=userDao.queryAll(user);
     if(user1.getPassword().equals(user.getPassword())==false) return 3;
     return 1;
    }
    @Transactional
    @Override
    public void addUserService(User user) {
        userDao.addUser(user);
    }
}
