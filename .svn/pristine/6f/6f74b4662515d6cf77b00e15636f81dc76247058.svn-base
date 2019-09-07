package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.LogLogin;
import com.iweb.o2o.mapper.sys.LogLoginMapper;
import com.iweb.o2o.service.LogLoginService;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.LogLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:05
 * Description:
 */
@Service
public class LogLoginServiceImpl implements LogLoginService {
    @Autowired
    private LogLoginMapper logLoginMapper;

    @Override
    public DataGridView queryAllLogLogin(LogLoginVo logLoginVo) {
        PageHelper.startPage(logLoginVo.getPage(),logLoginVo.getLimit());
        QueryWrapper<LogLogin> queryWrapper = new QueryWrapper<>();
        List<LogLogin> logLogins = logLoginMapper.selectList(queryWrapper);
        PageInfo<LogLogin> pageInfo = new PageInfo<>();
        DataGridView<LogLogin> dataGridView = new DataGridView<>();
        dataGridView.setCount(pageInfo.getTotal());
        dataGridView.setData(logLogins);
        return dataGridView;
    }

    @Override
    public void addLogLogin(LogLogin logLogin) {
        logLoginMapper.insert(logLogin);
    }


    @Override
    public void deleteLogLogin(Integer logLoginid) {
        logLoginMapper.deleteById(logLoginid);
    }

    @Override
    public void deleteBatchLogLogin(Integer[] ids) {
        logLoginMapper.deleteBatchIds(Arrays.asList(ids));
    }

}

