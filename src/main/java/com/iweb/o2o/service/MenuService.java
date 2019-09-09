package com.iweb.o2o.service;

import com.iweb.o2o.entity.Menu;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.MenuVo;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 9:13
 * Description:
 */
@ResponseBody
public interface MenuService {
    /**
     * 查询所有菜单【带查询条件】
     * List<Menu>
     */
    List<Menu> queryAllMenuForList(MenuVo menuVo);

    /**
     * 根据用户id查询用户的可用菜单
     */
    List<Menu> queryMenuByUserIdForList(MenuVo menuVo, Long userId);

    /**
     * 查询所有菜单
     * @param menuVo
     * @param pageNum
     * @param pageSize
     * @return
     */
    DataGridView queryAllMenu(Integer pageNum,Integer pageSize,MenuVo menuVo);

    /**
     * 添加菜单
     * @param menuVo
     */
    void addMenu(MenuVo menuVo);

    /**
     * 修改菜单
     * @param menuVo
     */
    void updateMenu(MenuVo menuVo);

    /**
     * 根据pid查询菜单数量
     * @param pid
     * @return
     */
    Integer queryMenuByPid(Integer pid);

    /**
     * 根据id删除菜单
     * @param menuVo
     */
    void deleteMenu(MenuVo menuVo);
}
