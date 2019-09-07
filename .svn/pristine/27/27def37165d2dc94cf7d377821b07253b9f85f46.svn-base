package com.iweb.o2o.service;

import com.iweb.o2o.entity.LocalAuth;
import com.iweb.o2o.entity.ShopAuthMap;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 11:39
 * Description:
 */
@Repository
public interface ShopAuthMapService {
    /**
     * 查询登录人，可以看那些店铺
     * @param auth 参数可以只传Long/int 关键employee_id是什么类型，主要减少强转
     * @return
     */
    List<ShopAuthMap> getShopsByAuthId(LocalAuth auth);
}
