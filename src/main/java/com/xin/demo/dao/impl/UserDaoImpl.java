package com.xin.demo.dao.impl;

import com.xin.demo.dao.UserDao;
import com.xin.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * UserDaoImpl：List<User> users /   save: 往users中add
 * findone：在List<User>中查找、   findAll：返回users
 */
@Repository
public class UserDaoImpl implements UserDao {

    List<User> userList = new ArrayList<User>();

    @Override
    public void save(User user) {
        userList.add(user);
    }

    @Override
    public User findOne(String username,String password) {
        User temp= null;
        for(User u: userList){
            if (u.getUsername().equals(username) &&
                    u.getPassword().equals(password)){
                temp=new User(username,password);
            }
        }
        return temp;
    }

    @Override
    public List<User> findAll() {
        return userList;
    }

    @Override
    public boolean cleanAll() {
        userList.clear();
        return true;
    }
}
