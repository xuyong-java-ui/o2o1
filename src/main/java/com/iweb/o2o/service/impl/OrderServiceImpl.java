package com.iweb.o2o.service.impl;

import com.github.pagehelper.PageInfo;
import com.iweb.o2o.dto.OrderDTO;
import com.iweb.o2o.service.OrderService;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 8:58
 * Description:
 */
public class OrderServiceImpl implements OrderService {
    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO getOrderById(String orderId) {
        return null;
    }

    @Override
    public PageInfo<OrderDTO> findByBuyerOpenid(String buyerOpenid, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public OrderDTO cancel(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO finish(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public OrderDTO paid(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public PageInfo<OrderDTO> findList(Integer pageNum, Integer pageSize) {
        return null;
    }
}
