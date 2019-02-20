package com.clj.controller;

import com.clj.dao.RoleMapper;
import com.clj.dao.UserMapper;
import com.clj.entity.User;
import com.clj.service.UserService;
import com.clj.util.PasswordUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.security.util.Password;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "subLogin",method = RequestMethod.POST,
            produces = "application/json;charset=utf-8")
    public String sublogin(User user){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(),user.getPassword());
        try {
            subject.login(token);
            token.setRememberMe(user.isRememberMe());
           if(subject.hasRole("admin")){
               return "权限正确";
           }
            return "无此权限";
        }catch (IncorrectCredentialsException i){
           return "账号或密码错误";
        }catch (UnknownAccountException u){
            return "账号或密码错误";
        }
    }

    @RequestMapping("saveUser")
    public String saveUser(User user){
        String pwd = PasswordUtil.md5(user.getUsername(),user.getPassword());
        user.setPassword(pwd);
        userService.saveUser(user);
        return "新增成功";
    }

    /*测试*/
    @RequiresRoles("user")
    @RequestMapping("getUsernameByPassword")
    public User getUsernameByPassword(String username){
        return userService.getPasswordByUsername(username);
    }

    @RequestMapping(value = "testRole",method = RequestMethod.GET)
    public String testRole(){
        return "test Role Success";
    }

    @RequestMapping(value = "testRole1",method = RequestMethod.GET)
    public String testRole1(){
        return "test Role1 Success";
    }
    @RequestMapping(value = "testRole2",method = RequestMethod.GET)
    public String testRole2(){
        return "test Role2 Success";
    }

    @RequestMapping(value = "testPerms",method = RequestMethod.GET)
    public String testPerms(){
        return "test Perms Success";
    }

    @RequestMapping(value = "testPerms1",method = RequestMethod.GET)
    public String testPerms1(){
        return "test Perms1 Success";
    }
    @RequestMapping(value = "testPerms2",method = RequestMethod.GET)
    public String testPerms2(){
        return "test Perms2 Success";
    }
}
