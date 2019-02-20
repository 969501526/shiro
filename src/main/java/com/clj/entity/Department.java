package com.clj.entity;

import java.util.List;

public class Department {
    private Integer deptId;

    private String deptName;

    private Integer parentId;

    private List<Department> next;

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public List<Department> getNext() {
        return next;
    }

    public void setNext(List<Department> next) {
        this.next = next;
    }
}