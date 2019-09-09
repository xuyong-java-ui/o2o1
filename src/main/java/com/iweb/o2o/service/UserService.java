package com.iweb.o2o.service;

import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.UserVo;
import org.springframework.stereotype.Repository;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/9 20:45
 * Description:
 */
@Repository
public interface UserService {
    /**
     * 查询所有用户
     * @param userVo
     * @return
     */
    DataGridView queryAllUser(UserVo userVo);

    /**
     * 添加用户【操作2张表】
     * @param userVo
     */
    void addUser(UserVo userVo);

    /**
     * 修改用户【操作2张表】
     * @param userVo
     */
    void updateUser(UserVo userVo);

    /**
     * 根据id删除用户【操作2张表】
     * @param userid
     */
    void deleteUser(Long userid);

    /**
     * 批量删除用户【操作2张表】
     * @param ids
     */
    void deleteBatchUser(Long[] ids);

    /**
     * 重置密码 操作一张表
     * @param userid
     */
    void resetUserPwd(Long userid);

    /**
     * 加载用户管理的分配角色的数据
     * @param userId
     * @return
     */
    DataGridView queryUserRole(Long userId);

    /**
     *  保存用户和角色的关系
     * @param userVo
     */
    void saveUserRole(UserVo userVo);
}
