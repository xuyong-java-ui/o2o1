package com.iweb.o2o.service;

import com.iweb.o2o.entity.LogLogin;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.vo.LogLoginVo;
import org.springframework.stereotype.Repository;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:05
 * Description:
 */
@Repository
public interface LogLoginService {
    /**
     * 查询所有日志
     * @param logLoginVo
     * @return
     */
    public DataGridView queryAllLogLogin(LogLoginVo logLoginVo);

    /**
     * 添加日志
     * @param logLogin
     */
    public void addLogLogin(LogLogin logLogin);
    /**
     * 根据id删除日志
     * @param logLoginId
     */
    public void deleteLogLogin(Integer logLoginId);
    /**
     * 批量删除日志
     * @param ids
     */
    public void deleteBatchLogLogin(Integer [] ids);
}
