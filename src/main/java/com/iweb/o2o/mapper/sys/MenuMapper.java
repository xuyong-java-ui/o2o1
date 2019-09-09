package com.iweb.o2o.mapper.sys;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.iweb.o2o.entity.Menu;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 19:56
 * Description:
 */
@Repository
public interface MenuMapper extends BaseMapper<Menu> {
    /**
     * 根据角色id查询菜单
     * @param available
     * @param rid
     * @return
     */
    List<Menu> queryMenuByRoleId(@Param("available") Integer available, @Param("rid") Integer rid);

    /**
     * 根据用户id查询菜单
     * @param available
     * @param uid
     * @return
     */
    List<Menu> queryMenuByUid(@Param("available") Integer available,@Param("uid") Long uid);

    /**
     * 根据菜单id删除tb_role_menu里面的数据
     * @param mid
     */
    void deleteRoleMenuByMid(@Param("mid")Integer mid);
}
