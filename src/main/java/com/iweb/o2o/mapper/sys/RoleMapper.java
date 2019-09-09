package com.iweb.o2o.mapper.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iweb.o2o.entity.News;
import com.iweb.o2o.entity.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/9 20:49
 * Description:
 */
@Repository
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据角色id删除tb_role_menu中的数据
     * @param roleId
     */
    void deleteRoleMenuByRid(Integer roleId);

    /**
     * 根据角色id删除tb_role_user中的数据
     * @param roleId
     */
    void deleteRoleUserByRid(Integer roleId);

    /**
     * 保存角色和菜单的关系 tb_role_menu
     * @param rid
     * @param mid
     */
    void insertRoleMenu(@Param("rid") Integer rid, @Param("mid") Integer mid);

    /**
     * 根据用户id删除sys_role_user里面的数据
     * @param userid
     */
    void deleteRoleUserByUid(Long userid);

    /**
     * 根据用户ID查询角色
     * @param available
     * @param userId
     * @return
     */
    List<Role> queryRoleByUid(@Param("available")Integer available, @Param("uid") Long userId);
}
