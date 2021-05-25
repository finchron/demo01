package com.springboot.demo01.dao;

import com.springboot.demo01.pojo.UserPOJO;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDAO {
    List<UserPOJO> selectUserAll();
    UserPOJO selectUserById(@Param("id") Long id);

}
