package com.iweb.o2o.enums;

import lombok.Getter;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 19:48
 * Description:
 */
@Getter
public enum  ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),DOWN(1,"下架"),DEL(2,"删除");

    private Integer code;
    private String message;
    ProductStatusEnum(Integer code,String message) {
        this.code = code;
        this.message = message;
    }
}
