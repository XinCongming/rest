package com.xin.demo.service.impl;

import com.xin.demo.dao.UserDao;
import com.xin.demo.model.User;
import com.xin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public void regist(User user) {
        userDao.save(user);
    }

    @Override
    public User login(String username, String password) {
        User user = userDao.findOne(username, password);
        return user;
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public boolean cleanAll() {
        boolean b = userDao.cleanAll();
        return b;
    }
}
