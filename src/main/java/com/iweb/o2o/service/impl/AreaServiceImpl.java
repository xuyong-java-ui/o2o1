package com.iweb.o2o.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iweb.o2o.entity.Area;
import com.iweb.o2o.exception.O2OException;
import com.iweb.o2o.mapper.shop.AreaMapper;
import com.iweb.o2o.service.AreaService;
import com.iweb.o2o.utils.RedisUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:04
 * Description:
 */
@Service
@Slf4j
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaMapper areaMapper;
    @Autowired
    private RedisUtil redisUtil;

    private static String AREALISTKEY = "arealist";
    @Override
    public List<Area> getAreaList()  {
        String key = AREALISTKEY;
        List<Area> areaList = null;
        ObjectMapper mapper = new ObjectMapper();

        if(!redisUtil.exists(key)) {
            //key不存在，从数据库中查找，然后放入redis
            areaList = areaMapper.queryAreas();
            try {
                String jsonStr = mapper.writeValueAsString(areaList);
                redisUtil.set(key,jsonStr);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
                log.error(e.getMessage());
                throw new O2OException(e.getMessage());
            }
        } else {
            String jsonStr = redisUtil.get(key);

            JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class,Area.class);
            try {
                String obj = mapper.readValue(jsonStr, String.class);
                areaList = mapper.readValue(obj,javaType);
            } catch (IOException e) {
                e.printStackTrace();
                log.error(e.getMessage());
                throw new O2OException(e.getMessage());
            }
        }
        return areaList;
    }
}
