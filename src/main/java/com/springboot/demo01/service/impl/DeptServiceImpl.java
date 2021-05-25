package com.springboot.demo01.service.impl;

import com.springboot.demo01.dao.DeptDao;
import com.springboot.demo01.pojo.DeptPOJO;
import com.springboot.demo01.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<DeptPOJO> selectDeptAll() {
        return deptDao.selectDeptAll();
    }
}
