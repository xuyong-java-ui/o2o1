package com.iweb.o2o.service;

import com.github.pagehelper.PageInfo;
import com.iweb.o2o.entity.Product;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 23:06
 * Description:封装Product相关操作的接口
 */
@Repository
public interface ProductService {
    /**
     * 带查询条件的分页数据
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<Product> getPage(Integer pageNum, Integer pageSize, ProductVo productVo);

    /**
     * 根据商品id删除
     * @param product
     */
    void deleteProductById(Product product);

    /**
     * 下架商品
     * @param product
     */
    void down(Product product);

    /**
     * 上架商品
     * @param product
     */
    void up(Product product);

    /**
     * 批量删除
     * @param ids
     */
    void deleteProductByIds(String[] ids);

    /**
     * 新增商品
     * @param product
     */
    void addProduct(Product product);

    /**
     * 修改商品
     * @param product
     */
    void updateProduct(Product product);
}
