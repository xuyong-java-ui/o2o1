package com.iweb.o2o.service;

import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.ProductCategory;
import org.springframework.stereotype.Repository;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/6 9:29
 * Description:
 */
@Repository
public interface ProductCategoryService {
    /**
     * 带条件的分页查询
     * @param productCategory
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<ProductCategory> getPage(ProductCategory productCategory, Integer pageNum, Integer pageSize);
}
