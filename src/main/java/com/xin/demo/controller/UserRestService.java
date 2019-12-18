package com.xin.demo.controller;

import com.xin.demo.model.ResResult;
import com.xin.demo.model.User;
import com.xin.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Lucas
 * @Date 2019/12/16 9:09
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserRestService {
    @Resource
    private UserService userService;

    /**
     * 注册服务
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST)
    public ResResult regist(@RequestBody User user) {
        System.out.println("----regist----");
        try {
            userService.regist(user);
            return new ResResult(true,"添加成功！");
        } catch (Exception e){
            e.printStackTrace();
            return new ResResult(false, "添加失败！");
        }
    }

    @RequestMapping(value="/{username}/{password}",method = RequestMethod.GET)
    public User login(@PathVariable("username") String username, @PathVariable("password") String password) {
        try {
            return userService.login(username,password);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        System.out.println("----get----");
        return userService.findAll();
    }

    @RequestMapping(value = "/clean",method = RequestMethod.GET)
    public boolean clean() {
        System.out.println("----clean----");
        return userService.cleanAll();
    }


}
