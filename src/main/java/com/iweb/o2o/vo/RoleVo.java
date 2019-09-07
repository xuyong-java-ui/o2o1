package com.iweb.o2o.vo;

import com.iweb.o2o.entity.Role;
import lombok.Data;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 9:01
 * Description:
 */
@Data
public class RoleVo extends Role {
    /**
     * 分页参数
     */
    private Integer page;
    private Integer limit;

    //接收多个角色id
    private Integer [] ids;

}
