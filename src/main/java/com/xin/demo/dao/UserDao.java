package com.xin.demo.dao;

import com.xin.demo.model.User;

import java.util.List;

/**
 * UserDao:三个方法   ： save 、findone、 findAll
 */
public interface UserDao {
    void save(User user);

    User findOne(String username,String password);

    List<User> findAll();

    boolean cleanAll();
}
