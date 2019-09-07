package com.iweb.o2o.service.impl;

import com.iweb.o2o.mapper.shop.ChartMapper;
import com.iweb.o2o.service.ChartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/6 11:44
 * Description:
 */
@Service
public class ChartServiceImpl implements ChartService {
    @Autowired
    private ChartMapper chartMapper;
    @Override
    public List<Map<String, Object>> getTop5Product(Map<String, String> map) {
        return chartMapper.getTop5Product(map);
    }

    @Override
    public Map<String, Integer> getOrderStatus(Map<String, String> map) {
        return chartMapper.getOrderStatus(map);
    }

    @Override
    public List<Map<String, Object>> getMonet(Map<String, String> map) {
        return chartMapper.getMoney(map);
    }


}
