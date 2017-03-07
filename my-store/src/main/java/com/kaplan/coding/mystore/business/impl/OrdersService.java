package com.kaplan.coding.mystore.business.impl;

import java.util.List;

import com.kaplan.coding.mystore.business.vo.OrdersVO;


public interface OrdersService {
    
    public List<OrdersVO> getAllOrdersVO();

    public Boolean updateOrdersVO(OrdersVO ordersVO);

    public Boolean saveOrdersVO(OrdersVO ordersVO);

    public Boolean deleteOrdersVO(OrdersVO ordersVO);

}
