package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iweb.o2o.entity.PersonInfo;
import com.iweb.o2o.mapper.shop.PersonInfoMapper;
import com.iweb.o2o.service.PersonInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:06
 * Description:
 */
@Service
public class PersonInfoServiceImpl implements PersonInfoService {
    @Autowired
    private PersonInfoMapper personInfoMapper;
    @Override
    public int addPersonInfo(PersonInfo personInfo) {
        return personInfoMapper.insert(personInfo);
    }

    @Override
    public PersonInfo getPersonInfoById(Long userId) {
        return personInfoMapper.selectById(userId);
    }
}
