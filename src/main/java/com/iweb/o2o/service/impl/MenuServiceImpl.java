package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.Menu;
import com.iweb.o2o.mapper.sys.MenuMapper;
import com.iweb.o2o.service.MenuService;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.MenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        if(!org.springframework.util.StringUtils.isEmpty(menuVo.getTitle())) {
            queryWrapper.like("title",menuVo.getTitle());
        }
        if(!org.springframework.util.StringUtils.isEmpty(menuVo.getAvailable())) {
            queryWrapper.eq("available",menuVo.getAvailable());
        }

        if(!StringUtils.isEmpty(menuVo.getId())) {
            queryWrapper.eq("id",menuVo.getId()).or().eq("pid",menuVo.getId());
        }
        return menuMapper.selectList(queryWrapper);
    }

    @Override
    public List<Menu> queryMenuByUserIdForList(MenuVo menuVo, Long userId) {
        //  QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        //  return menuMapper.selectList(queryWrapper);
        return menuMapper.queryMenuByUid(menuVo.getAvailable(),userId);
    }

    @Override
    public DataGridView queryAllMenu(Integer pageNum, Integer pageSize, MenuVo menuVo) {
        PageHelper.startPage(pageNum,pageSize);
        List<Menu> list = this.queryAllMenuForList(menuVo);
        PageInfo<Menu> pageInfo = new PageInfo<>(list);
        DataGridView<Menu> dataGridView = new DataGridView<>();
        dataGridView.setCount(pageInfo.getTotal());
        dataGridView.setData(list);
        return dataGridView;
    }

    @Override
    public void addMenu(MenuVo menuVo) {
        menuMapper.insert(menuVo);
    }

    @Override
    public void updateMenu(MenuVo menuVo) {
        menuMapper.updateById(menuVo);
    }

    @Override
    public Integer queryMenuByPid(Integer pid) {
        QueryWrapper<Menu> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("pid",pid);
        return menuMapper.selectCount(queryWrapper);
    }

    @Override
    public void deleteMenu(MenuVo menuVo) {
        //删除菜单表的数据
        this.menuMapper.deleteById(menuVo.getId());

        //根据菜单id删除tb_role_menu里面的数据
        this.menuMapper.deleteRoleMenuByMid(menuVo.getId());
    }
}
