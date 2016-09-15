package com.kaplan.coding.mystore.persistence.domain;

public class Orders {
	private Integer orderId; // ID; //	NUMBER(10,0)
	private Integer amount;// AMOUNT; //	NUMBER(5,2)
	//#######################################
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", amount=" + amount + "]";
	}
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
