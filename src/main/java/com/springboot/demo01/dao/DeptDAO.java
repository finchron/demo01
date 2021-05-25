package com.springboot.demo01.dao;

import com.springboot.demo01.vo.DeptVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DeptDAO {
    @Select("select id,name from dept")
    List<DeptVO> selectDeptAll();

    @Select("select id,name from dept where id = #{id}")
    DeptVO selectDeptById(Long id);
}
