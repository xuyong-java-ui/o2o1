package com.iweb.o2o.service;

import com.iweb.o2o.entity.OrderDetail;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auter : Xuyong
 * @Date : 2019/9/7 8:57
 * Description:
 */
@Repository
public interface OrderDetailService {
    /**
     * 根据订单id查询 订单明细
     * @param orderId
     * @return
     */
    List<OrderDetail> findByOrderId(String orderId);
}
