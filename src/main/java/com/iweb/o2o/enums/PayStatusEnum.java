package com.iweb.o2o.enums;

import lombok.Getter;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 19:48
 * Description:
 */
@Getter
public enum  PayStatusEnum implements CodeEnum{
    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;

    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
