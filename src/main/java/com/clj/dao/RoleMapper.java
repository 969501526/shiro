package com.clj.dao;

import com.clj.entity.Role;
import com.clj.entity.RoleExample;
import com.clj.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper {
    List<Role> getUserByRoles(String username);

    List<Role> getUserByRoleId(String username);
}