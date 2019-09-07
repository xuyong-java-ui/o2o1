package com.iweb.o2o.service;

import com.iweb.o2o.entity.PersonInfo;
import org.springframework.stereotype.Repository;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:06
 * Description:
 */
@Repository
public interface PersonInfoService {

    /**
     * 添加用户
     * @param personInfo
     * @return
     */
    int addPersonInfo(PersonInfo personInfo);

    /**
     * 根据id查询PersonInfo信息
     * @param userId
     * @return
     */
    PersonInfo getPersonInfoById(Long userId);
}
