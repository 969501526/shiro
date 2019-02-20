package com.clj.dao;

import com.clj.entity.User;

import java.util.List;

public interface UserMapper {
   List<User> getUselAll();

   User getPasswordByUsername(String username);

   Integer saveUser(User user);

}