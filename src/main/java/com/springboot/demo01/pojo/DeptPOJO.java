package com.springboot.demo01.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DeptPOJO {

    private Long id;
    private String name;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DeptPOJO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
