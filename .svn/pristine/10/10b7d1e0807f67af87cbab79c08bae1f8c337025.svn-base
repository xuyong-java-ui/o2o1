package com.iweb.o2o.controller.sys;

import com.iweb.o2o.service.LogLoginService;
import com.iweb.o2o.utils.DataGridView;
import com.iweb.o2o.utils.ResultObj;
import com.iweb.o2o.vo.LogLoginVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/5 19:37
 * Description:
 */
@RestController
@RequestMapping("sys/logLogin")
public class LogLoginController {
    @Autowired
    private LogLoginService logLoginService;

    /**
     * 加载日志列表返回DataGridView
     */
    @RequestMapping("loadAllLogLogin")
    public DataGridView loadAllLogInfo(LogLoginVo logLoginVo) {
        return this.logLoginService.queryAllLogLogin(logLoginVo);
    }

    /**
     * 删除日志
     */
    @RequestMapping("deleteLogLogin")
    public ResultObj deleteLogInfo(LogLoginVo logLoginVo) {
        try {
            this.logLoginService.deleteLogLogin(logLoginVo.getId());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

    /**
     * 批量删除日志
     */
    @RequestMapping("deleteBatchLogLogin")
    public ResultObj deleteBatchLogLogin(LogLoginVo logLoginVo) {
        try {
            this.logLoginService.deleteBatchLogLogin(logLoginVo.getIds());
            return ResultObj.DELETE_SUCCESS;
        } catch (Exception e) {
            e.printStackTrace();
            return ResultObj.DELETE_ERROR;
        }
    }

}
