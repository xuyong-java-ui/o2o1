package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iweb.o2o.entity.LocalAuth;
import com.iweb.o2o.entity.ShopAuthMap;
import com.iweb.o2o.mapper.shop.ShopAuthMapMapper;
import com.iweb.o2o.service.ShopAuthMapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 11:42
 * Description:
 */
@Service
public class shopAuthMapServiceImpl implements ShopAuthMapService {
    @Autowired
    private ShopAuthMapMapper shopAuthMapMapper;
    @Override
    public List<ShopAuthMap> getShopsByAuthId(LocalAuth auth) {
        QueryWrapper queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("employee_id",auth.getUserId());
        return shopAuthMapMapper.selectList(queryWrapper);
    }
}
