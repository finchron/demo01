package com.springboot.demo01.dao;

import com.springboot.demo01.pojo.DeptPOJO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface DeptDao{
    @Select("select * from dept")
    List<DeptPOJO> selectDeptAll();
}
