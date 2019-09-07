package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.iweb.o2o.entity.Menu;
import com.iweb.o2o.mapper.sys.MenuMapper;
import com.iweb.o2o.service.MenuService;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 9:13
 * Description:
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;
    @Override
    public List<Menu> queryAllMenuForList(MenuVo menuVo) {
        return menuMapper.selectList(new QueryWrapper<>());
    }

    @Override
    public List<Menu> queryMenuByUserIdForList(MenuVo menuVo, Integer userId) {
        return null;
    }

    @Override
    public DataGridView queryAllMenu(MenuVo menuVo) {
        return null;
    }

    @Override
    public void addMenu(MenuVo menuVo) {

    }

    @Override
    public void updateMenu(MenuVo menuVo) {

    }

    @Override
    public Integer queryMenuByPid(Integer pid) {
        return null;
    }

    @Override
    public void deleteMenu(MenuVo menuVo) {
        //删除菜单表的数据
        this.menuMapper.deleteById(menuVo.getId());

        //根据菜单id删除sys_role_menu里面的数据
        //this.menuMapper.deleteRoleMenuByMid(menuVo.getId());
    }
}
