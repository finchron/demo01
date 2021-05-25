package com.springboot.demo01.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserPOJO {

    @Id
    private Long id;
    private String name;
    private Long deptId;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "UserPOJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                '}';
    }
}
