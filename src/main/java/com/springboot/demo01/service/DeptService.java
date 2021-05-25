package com.springboot.demo01.service;

import com.springboot.demo01.pojo.DeptPOJO;

import java.util.List;

public interface DeptService {
    List<DeptPOJO> selectDeptAll();
}
