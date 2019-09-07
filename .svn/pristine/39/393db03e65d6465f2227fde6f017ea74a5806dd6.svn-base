package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.LogLogin;
import com.iweb.o2o.entity.News;
import com.iweb.o2o.mapper.sys.NewsMapper;
import com.iweb.o2o.service.NewsService;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.NewsVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 9:12
 * Description:
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsMapper newsMapper;

    @Override
    public DataGridView queryAllNews(NewsVo newsVo) {
        PageHelper.startPage(newsVo.getPage(),newsVo.getLimit());
        QueryWrapper<News> queryWrapper = new QueryWrapper<>();
        List<News> news = newsMapper.selectList(queryWrapper);
        PageInfo<LogLogin> pageInfo = new PageInfo<>();
        DataGridView<News> dataGridView = new DataGridView<>();
        dataGridView.setCount(pageInfo.getTotal());
        dataGridView.setData(news);
        return dataGridView;
    }

    @Override
    public void addNews(NewsVo newsVo) {
        newsMapper.insert(newsVo);
    }

    @Override
    public void updateNews(NewsVo newsVo) {
        newsMapper.update(newsVo,null);
    }

    @Override
    public void deleteNews(Integer newsid) {
        newsMapper.deleteById(newsid);
    }

    @Override
    public void deleteBatchNews(Integer[] ids) {
        newsMapper.deleteBatchIds(Arrays.asList(ids));
    }

    @Override
    public News queryNewsById(Integer id) {
        return newsMapper.selectById(id);
    }
}
