package com.iweb.o2o.vo;

import com.iweb.o2o.entity.LogLogin;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 19:39
 * Description:
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class LogLoginVo extends LogLogin {
    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;

    /**
     * 时间
     */
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date startTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endTime;


    //接收多个id
    private Integer [] ids;
}
