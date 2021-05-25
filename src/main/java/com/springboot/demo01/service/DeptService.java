package com.springboot.demo01.service;

import com.springboot.demo01.vo.DeptVO;

import java.util.List;

public interface DeptService {
    List<DeptVO> selectDeptAll();
    DeptVO selectDeptById(Long id);
}
