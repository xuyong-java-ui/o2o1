package com.iweb.o2o.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserAwardMap {
    private Long userAwardId;

    private Long userId;

    private Long awardId;

    private Long shopId;

    private String userName;

    private String awardName;

    private Date expireTime;

    private Date createTime;

    private Integer usedStatus;

    private Integer point;

    private PersonInfo user;	//操作员息实体类

    private Award award;	//奖品信息实体类

    private Shop shop;		//店铺信息实体类

}