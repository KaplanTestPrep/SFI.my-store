package com.kaplan.coding.mystore.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author IAhmed
 *
 */
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
	private Integer orderItemId; // ORDER_ITEM_ID;//	NUMBER(10,0)
	private Integer quantity; // SOLD_QUANTITY;//	NUMBER(5,0)
	private Integer unitPrice; //UNIT_PRICE;//	NUMBER(5,2)
	private Integer productSku; //PRODUCT_SKU;//	NUMBER(20,0)
	private Integer orderId; // ORDER_ID; //	NUMBER(10,0)
	//###########################
	public OrderItem(Integer orderItemId,Integer qantity,Integer unitPrice,Integer productSku, Integer orderId) {
		super();
		this.orderItemId = orderItemId;
		this.quantity = qantity;
		this.unitPrice = unitPrice;
		this.productSku = productSku;
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "OrderItem [orderItemId=" + orderItemId + ", antity=" + quantity
				+ ", unitPrice=" + unitPrice + ", productSku=" + productSku
				+ ", orderId=" + orderId + "]";
	}
	@Id
	//@GeneratedValue
	@Column(name ="ORDER_ITEM_ID")
	public Integer getOrderItemId() {
		return orderItemId;
	}
	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}
	//---------------------------
	@Column(name = "SOLD_QUANTITY")
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	//------------------------------
	@Column(name = "UNIT_PRICE")
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	//--------------------------------
	@Column(name = "PRODUCT_SKU")
	public Integer getProductSku() {
		return productSku;
	}
	public void setProductSku(Integer productSku) {
		this.productSku = productSku;
	}
	//-------------------------
	@Column(name = "ORDER_ID")
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

}
