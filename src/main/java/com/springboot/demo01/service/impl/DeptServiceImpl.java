package com.springboot.demo01.service.impl;

import com.springboot.demo01.dao.DeptDAO;
import com.springboot.demo01.service.DeptService;
import com.springboot.demo01.vo.DeptVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@SuppressWarnings("all")
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDAO deptDao;

    @Override
    public List<DeptVO> selectDeptAll() {
        return deptDao.selectDeptAll();
    }

    @Override
    public DeptVO selectDeptById(Long id) {
        return deptDao.selectDeptById(id);
    }
}
