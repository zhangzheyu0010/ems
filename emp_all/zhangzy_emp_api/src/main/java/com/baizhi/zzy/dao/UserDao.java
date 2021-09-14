package com.baizhi.zzy.dao;

import com.baizhi.zzy.entity.User;

public interface UserDao {
    public User queryAll(User user);
    public void addUser(User user);
}
