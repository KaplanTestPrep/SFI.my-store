package com.kaplan.coding.mystore.persistence.domain;

import java.util.Date;

public class OrderItem {
	private Integer orderItemId; // ORDER_ITEM_ID;//	NUMBER(10,0)
	private Integer qantity; //soldQuSOLD_QUANTITY;//	NUMBER(5,0)
	private Integer unitPrice; //UNIT_PRICE;//	NUMBER(5,2)
	private Integer productSku; //PRODUCT_SKU;//	NUMBER(20,0)
	private Integer orderId; // ORDER_ID; //	NUMBER(10,0)
	//###########################
	public OrderItem(Integer orderItemId,Integer qantity,Integer unitPrice,Integer productSku, Integer orderId) {
		super();
		this.orderItemId = orderItemId;
		this.qantity = qantity;
		this.unitPrice = unitPrice;
		this.productSku = productSku;
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", antity=" + qantity
				+ ", unitPrice=" + unitPrice + ", productSku=" + productSku
				+ ", orderId=" + orderId + "]";
	}
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	public Integer getAntity() {
		return qantity;
	}
	public void setAntity(Integer antity) {
		this.qantity = antity;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Integer getProductSku() {
		return productSku;
	}
	public void setProductSku(Integer productSku) {
		this.productSku = productSku;
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
