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
    List<Map<String, Object>> getTop5Product(Map<String, String> map);
    Map<String, Integer> getOrderStatus(Map<String, String> map);
    List<Map<String, Object>> getMoney(Map<String, String> map);
}
