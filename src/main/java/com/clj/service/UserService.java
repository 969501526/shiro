package com.clj.service;

import com.clj.dao.UserMapper;
import com.clj.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> getUserAll(){
        return userMapper.getUselAll();
    }

    public User getPasswordByUsername(String username){
        return userMapper.getPasswordByUsername(username);
    }

    public Integer saveUser(User user){
        return userMapper.saveUser(user);
    }
}
