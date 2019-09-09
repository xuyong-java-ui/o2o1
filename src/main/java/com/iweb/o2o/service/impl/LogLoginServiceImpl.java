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
import org.springframework.util.StringUtils;

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
    private LogLoginMapper logInfoMapper;
    @Override
    public DataGridView queryAllLogLogin(LogLoginVo logLoginVo) {
        PageHelper.startPage(logLoginVo.getPage(),logLoginVo.getLimit());
        QueryWrapper<LogLogin> queryWrapper = new QueryWrapper<>();
        //封装查询条件
        if(!StringUtils.isEmpty(logLoginVo.getLoginname())) {
            queryWrapper.like("loginname",logLoginVo.getLoginname());
        }
        if(!StringUtils.isEmpty(logLoginVo.getLoginip())) {
            queryWrapper.like("loginip",logLoginVo.getLoginip());
        }

        if(!StringUtils.isEmpty(logLoginVo.getStartTime())) {
            queryWrapper.ge("logintime",logLoginVo.getStartTime());
        }

        if(!StringUtils.isEmpty(logLoginVo.getEndTime())) {
            queryWrapper.le("logintime",logLoginVo.getEndTime());
        }
        queryWrapper.orderByDesc("logintime");
        List<LogLogin> logInfos = logInfoMapper.selectList(queryWrapper);
        PageInfo<LogLogin> pageInfo = new PageInfo<>();
        DataGridView<LogLogin> dataGridView = new DataGridView<>();
        dataGridView.setCount(pageInfo.getTotal());
        dataGridView.setData(logInfos);
        return dataGridView;
    }

    @Override
    public void addLogLogin(LogLogin logLogin) {
        logInfoMapper.insert(logLogin);
    }

    @Override
    public void deleteLogLogin(Integer logLoginId) {
        logInfoMapper.deleteById(logLoginId);
    }

    @Override
    public void deleteBatchLogLogin(Integer[] ids) {
        logInfoMapper.deleteBatchIds(Arrays.asList(ids));
    }
}
