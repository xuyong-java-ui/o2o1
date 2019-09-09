package com.iweb.o2o.mapper.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iweb.o2o.vo.UserVo;
import io.lettuce.core.dynamic.annotation.Param;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/9 20:49
 * Description:
 */
@Repository
public interface UserMapper {
    /**
     * 查询所有用户
     * 应该在personInfo表中添加一个属性type，用于标识用户类型【普通用户、管理员】
     * @param userVo
     * @return
     */
    List<UserVo> queryAllUsers(UserVo userVo);

    /**
     * 保存用户和角色的关系
     * @param uid
     * @param rid
     */
    void insertUserRole(@Param("uid")Long uid, @Param("rid")Integer rid) ;
}
