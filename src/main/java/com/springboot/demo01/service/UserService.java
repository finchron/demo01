package com.springboot.demo01.service;

import com.springboot.demo01.pojo.UserPOJO;

import java.util.List;

public interface UserService {
    List<UserPOJO> selectUserAll();
}
