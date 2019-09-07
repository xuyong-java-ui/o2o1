package com.iweb.o2o.vo;

import com.iweb.o2o.entity.Product;
import lombok.Data;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 11:01
 * Description:
 */
@Data
public class ProductVo extends Product {
    private String productName;    //商品名称
    private String startPrice;     //现价的最低价格
    private String endPrice;       //现价的最高价格
    private String startTime;      //商品创建的时间
    private String endTime;        //商品创建的时间

    private List<Long> shopIds;    //查询条件，记录当前登录人有哪些shopId
}
