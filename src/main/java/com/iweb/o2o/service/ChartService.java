package com.iweb.o2o.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/6 11:44
 * Description:
 */
@Repository
public interface ChartService {

    /**
     * 获取商品热销top数据，按时间维度查询
     * @param map
     * @return
     */
    List<Map<String,Object>> getTop5Product(Map<String,String> map);

    /**
     * 获取订单金额
     * @param map
     * @return
     */
    List<Map<String,Object>> getMoney(Map<String,String> map);

    /**
     * 订单状态分布分析
     * @param map
     * @return
     */
    Map<String,Integer> getOrderStatus(Map<String,String> map);
}
