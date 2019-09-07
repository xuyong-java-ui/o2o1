package com.iweb.o2o.vo;

import com.iweb.o2o.entity.News;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 9:00
 * Description:
 */
@Data
public class NewsVo extends News {
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
