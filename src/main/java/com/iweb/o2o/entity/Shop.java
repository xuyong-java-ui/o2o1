package com.iweb.o2o.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Shop {
    private Long shopId;

    private Long ownerId;

    private Integer areaId;

    private Long shopCategoryId;

    private Integer parentCategoryId;

    private String shopName;

    private String shopDesc;

    private String shopAddr;

    private String phone;

    private String shopImg;

    private Double longitude;

    private Double latitude;

    private Integer priority;

    private Date createTime;

    private Date lastEditTime;

    private Integer enableStatus;

    private String advice;

    private Area area;
    private ShopCategory shopCategory;
    private ShopCategory parentCategory;
}