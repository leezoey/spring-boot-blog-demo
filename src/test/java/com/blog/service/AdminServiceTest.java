package com.blog.service;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.blog.service.AdminService;
import com.blog.domain.Admin;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTest {
    @Autowired
    AdminService adminService;

    @Test
    public void testServiceCount() throws Exception {
        Integer number = new Integer(10080);
        Admin test = adminService.getById(number);
        System.out.println(test.getPassword());
    }



}
