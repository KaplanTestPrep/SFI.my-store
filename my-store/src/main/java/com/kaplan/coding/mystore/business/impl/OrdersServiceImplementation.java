/**
 * 
 */
package com.kaplan.coding.mystore.business.impl;

import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;
import com.kaplan.coding.mystore.business.vo.OrdersVO;
import com.kaplan.coding.mystore.persistence.dao.OrdersDAO;
import com.kaplan.coding.mystore.persistence.domain.Orders;

/**
 * @author IAhmed
 *
 */
public class OrdersServiceImplementation implements OrdersService {
    private static final Logger log = Logger.getLogger(OrdersServiceImplementation.class);

    @Autowired()
    @Qualifier("ordersDAO")
    private OrdersDAO ordersDAO;
    
    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.business.impl.ProductService#getAllProducts()
     */

    @Override
    @Transactional(readOnly=true)
    public List<OrdersVO> getAllOrdersVO() {
        log.debug("Retrieving all Orders");
        List<OrdersVO> ordersVoList = new ArrayList<OrdersVO>();
        List<Orders> result = this.ordersDAO.getAll();
        log.debug("Result ="+result.size());
        for (Orders orders : result) {
            OrdersVO tempOrdersVo = new OrdersVO();
            tempOrdersVo.setOrderID(orders.getOrderId()); 
            tempOrdersVo.setAmount(orders.getAmount()); 
            tempOrdersVo.setCreatedDate(orders.getCreatedDate());
            ordersVoList.add(tempOrdersVo);
        }
        return ordersVoList; 

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.business.impl.ProductService#updateProduct(
     * com.kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean updateOrdersVO(OrdersVO ordersVO) {
        log.debug("Executing to update orders!");
        try {
            Orders tempOrder = new Orders();
            tempOrder.setOrderId(ordersVO.getOrderID()); 
            tempOrder.setAmount(ordersVO.getAmount());
            tempOrder.setCreatedDate(ordersVO.getCreatedDate());
            this.ordersDAO.update(tempOrder);
            log.debug("Operation performed!");
            return true;
        } catch (Exception e) {
            log.error("Exception!!", e);
            return false;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.business.impl.ProductService#saveProduct(com
     * .kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean saveOrdersVO(OrdersVO ordersVO) {
        try {
            Orders tempOrder = new Orders();
            tempOrder.setOrderId(ordersVO.getOrderID()); 
            tempOrder.setAmount(ordersVO.getAmount());
            tempOrder.setCreatedDate(ordersVO.getCreatedDate());
            this.ordersDAO.save(tempOrder); 
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.business.impl.ProductService#deleteProduct(
     * com.kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean deleteOrdersVO(OrdersVO ordersVO) {
        try {
            Orders tempOrder = new Orders();
            tempOrder.setOrderId(ordersVO.getOrderID()); 
            tempOrder.setAmount(ordersVO.getAmount());
            tempOrder.setCreatedDate(ordersVO.getCreatedDate());
            this.ordersDAO.delete(tempOrder);
            return true;
        } catch (Exception e) {
            return false;
        }
    }



}
