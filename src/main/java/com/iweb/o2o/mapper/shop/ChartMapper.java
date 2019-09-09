package com.iweb.o2o.mapper.shop;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/6 11:40
 * Description:
 */
@Repository
public interface ChartMapper{

    /**
     * 商品热销top5
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
