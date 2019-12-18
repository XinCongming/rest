package com.xin.demo.service;

import com.xin.demo.dao.UserDao;
import com.xin.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * UserService：regist 、login、 findAll
 */
public interface UserService {

    void regist(User user);

    User login(String username, String password);

    List<User> findAll();

    boolean cleanAll();

}
