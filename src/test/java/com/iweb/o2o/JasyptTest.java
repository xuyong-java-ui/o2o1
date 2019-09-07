package com.iweb.o2o;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 20:47
 * Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class JasyptTest {

    //注入StringEncryptor
    @Autowired
    StringEncryptor encryptor;

    @Test
    public void encry() {
        //加密root
        String username = encryptor.encrypt("root");
        System.out.println(username);
        //加密123
        String password = encryptor.encrypt("123456");
        System.out.println(password);
    }
}