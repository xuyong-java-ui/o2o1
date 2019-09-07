package com.iweb.o2o.service.impl;

import com.iweb.o2o.service.LocalAuthService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.DigestUtils;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 20:45
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class LocalAuthServiceImplTest {
    @Autowired
    private LocalAuthService localAuthService;

    @Test
    public void checkUserName() {
        System.out.println(localAuthService.checkUserName("admin"));
    }

    @Test
    public void login() {
        String password = DigestUtils.md5DigestAsHex("123456".getBytes());
        System.out.println("=============>" +localAuthService.login("admin", password));
    }
}
