package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iweb.o2o.entity.LocalAuth;
import com.iweb.o2o.entity.PersonInfo;
import com.iweb.o2o.enums.PersonInfoFlag;
import com.iweb.o2o.mapper.shop.LocalAuthMapper;
import com.iweb.o2o.mapper.shop.PersonInfoMapper;
import com.iweb.o2o.service.LocalAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.util.Date;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:05
 * Description:
 */
@Service
public class LocalAuthServiceImpl implements LocalAuthService {
    @Autowired
    private LocalAuthMapper localAuthMapper;

    @Override
    public LocalAuth checkUserName(String userName) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name",userName);
        LocalAuth localAuth = localAuthMapper.selectOne(wrapper);
        return localAuth;
    }

    @Override
    public LocalAuth login(String userName, String pwd) {
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name",userName);
        wrapper.eq("password",pwd);
        return localAuthMapper.selectOne(wrapper);
    }

    @Override
    public int addLocalAuth(LocalAuth localAuth) {
        return localAuthMapper.insert(localAuth);
    }
}
