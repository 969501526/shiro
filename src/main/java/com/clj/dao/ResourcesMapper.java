package com.clj.dao;

import com.clj.entity.Resources;
import com.clj.entity.ResourcesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourcesMapper {
    List<Resources> getRoleByResoures(Integer roleId);
}