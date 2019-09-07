package com.iweb.o2o.utils;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/4 14:06
 * Description:该接口，我们定义系统常量
 * 定义接口的目的：是可以省略public  static final
 */
public interface SysConstants {
    String USER_ERROR = "用户名或密码错误";

    String CODE_ERROR = "验证码错误";

    String SESSION_USER = "user";

    String PERSON_INFO = "personInfo";
    /**
     * 临时文件标记
     */
    String FILE_UPLOAD_TEMP = "_temp";

    /**
     * 默认图片地址
     */
    Object DEFAULT_PRODUCT_IMG = "static/images/defaultcarimage.jpg";

    /**
     * 操作状态
     */
    String ADD_SUCCESS="添加成功";
    String ADD_ERROR="添加失败";

    String UPDATE_SUCCESS="更新成功";
    String UPDATE_ERROR="更新失败";

    String DELETE_SUCCESS="删除成功";
    String DELETE_ERROR="删除失败";

    String RESET_SUCCESS="重置成功";
    String RESET_ERROR="重置失败";

    String DISPATCH_SUCCESS="分配成功";
    String DISPATCH_ERROR="分配失败";

    String DOWN_SUCCESS="下架成功";
    String DOWN_ERROR="下架失败";

    String UP_SUCCESS="上架成功";
    String UP_ERROR="上架失败";

    Integer CODE_SUCCESS=0; //操作成功
    Integer CODE_FAILER=-1;//失败
}
