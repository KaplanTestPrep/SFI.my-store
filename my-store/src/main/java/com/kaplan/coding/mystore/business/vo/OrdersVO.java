package com.kaplan.coding.mystore.business.vo;
/**
 * 
 * @author IAhmed
 *
 */
import java.io.Serializable;
import java.util.Date;

import org.apache.log4j.Logger;

public class OrdersVO implements Serializable{
    /**
     * 
     */
    private static final long serialVersionUID = 7781247596111572408L;

    private static final Logger log = Logger.getLogger(OrdersVO.class);
    
    private Integer orderID;
    private double amount;
    private Date createdDate;
    
    @Override
    public String toString() {
        return "OrdersVO [orderID=" + orderID + ", amount=" + amount
                + ", createdDate=" + createdDate + "]";
    }
    public Integer getOrderID() {
        return orderID;
    }
    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    

}



