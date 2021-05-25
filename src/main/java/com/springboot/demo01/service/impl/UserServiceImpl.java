package com.springboot.demo01.service.impl;

import com.springboot.demo01.dao.UserDAO;
import com.springboot.demo01.pojo.UserPOJO;
import com.springboot.demo01.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("all")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public List<UserPOJO> selectUserAll() {
        return userDAO.selectUserAll();
    }
}
