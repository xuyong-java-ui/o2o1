package com.iweb.o2o.entity;

import lombok.Data;

import java.util.Date;

@Data
public class LocalAuth {
    private Long localAuthId;

    private Long userId;

    private String userName;

    private String password;

    private Date createTime;

    private Date lastEditTime;

}