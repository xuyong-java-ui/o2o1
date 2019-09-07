package com.iweb.o2o.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.ProductCategory;
import com.iweb.o2o.mapper.shop.ProductCategoryMapper;
import com.iweb.o2o.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/6 9:29
 * Description:
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryMapper categoryMapper;

    @Override
    public PageInfo<ProductCategory> getPage(ProductCategory productCategory, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<ProductCategory> list=categoryMapper.selectList(new QueryWrapper<>());
        return new PageInfo<>(list);
    }
}
