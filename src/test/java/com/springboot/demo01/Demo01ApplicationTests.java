package com.springboot.demo01;

import com.springboot.demo01.service.DeptService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Demo01ApplicationTests {

    @Autowired
    private DeptService deptService;

    @Test
    void contextLoads() {
    }

    @Test
    void testDept(){
        System.out.println(deptService.selectDeptAll());
    }

}
