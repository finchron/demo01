package com.springboot.demo01.controller;

import com.springboot.demo01.pojo.DeptPOJO;
import com.springboot.demo01.service.DeptService;
import com.springboot.demo01.vo.DeptVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @GetMapping("/getDept")
    public List<DeptVO> selectDeptAll() {
        return deptService.selectDeptAll();
    }
}
