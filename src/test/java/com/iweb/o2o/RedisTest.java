package com.iweb.o2o;

import com.iweb.o2o.utils.RedisUtil;
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
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testSet() {
        String key = "k1";
        System.out.println(redisUtil.get(key));
        String value = "v1";
        redisUtil.set(key, value);
        System.out.println(redisUtil.get(key));
    }
}
