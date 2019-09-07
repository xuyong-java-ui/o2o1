package com.iweb.o2o.service;

import com.github.pagehelper.PageInfo;
import com.iweb.o2o.dto.OrderDTO;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 8:58
 * Description:
 */
@Repository
public interface OrderService {

    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 查询单个
     * @param orderId
     * @return
     */
    OrderDTO getOrderById(String orderId);

    /**
     * 根据买家的openid 查询分页订单列表
     * @param buyerOpenid
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<OrderDTO> findByBuyerOpenid(String buyerOpenid, Integer pageNum, Integer pageSize);

    /**
     * 取消订单
     * @param orderDTO
     * @return
     */
    OrderDTO cancel(OrderDTO orderDTO);

    /**
     * 完结订单
     * @param orderDTO
     * @return
     */
    OrderDTO finish(OrderDTO orderDTO);

    /**
     * 支付订单
     * @param orderDTO
     * @return
     */
    OrderDTO paid(OrderDTO orderDTO);

    /**
     * 查询所有订单列表【分页】
     * @param pageNum
     * @param pageSize
     * @return
     */
    PageInfo<OrderDTO> findList(Integer pageNum, Integer pageSize);

}
