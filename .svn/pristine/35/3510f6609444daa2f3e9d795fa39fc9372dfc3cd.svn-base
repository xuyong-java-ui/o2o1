package com.iweb.o2o.service;

import com.iweb.o2o.entity.LocalAuth;
import org.springframework.stereotype.Repository;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:05
 * Description:
 */
@Repository
public interface LocalAuthService {
    /**
     * 校验用户名
     * @param userName
     * @return
     */
    LocalAuth checkUserName(String userName);

    /**
     * 登录
     * @param userName
     * @param pwd
     * @return
     */
    LocalAuth login(String userName,String pwd);

    /**
     * 插入用户账户信息
     * @param localAuth
     * @return
     */
    int addLocalAuth(LocalAuth localAuth);
}
