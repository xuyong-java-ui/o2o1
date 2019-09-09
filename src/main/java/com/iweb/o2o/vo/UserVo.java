package com.iweb.o2o.vo;

import com.iweb.o2o.entity.PersonInfo;
import lombok.Data;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/9 20:46
 * Description:
 */
@Data
public class UserVo extends PersonInfo {
    /*分页参数*/
    private Integer page;
    private Integer limit;
    private String userName;
    private String password;

    private String birthTime;   //出生日期 防止400错误

    private Long[] uids;    //用于批量删除

    private Integer[] rids; //接收多个角色id
}
