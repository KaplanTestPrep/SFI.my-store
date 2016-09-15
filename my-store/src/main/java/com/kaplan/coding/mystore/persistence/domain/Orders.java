package com.kaplan.coding.mystore.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author IAhmed
 *
 */
@Entity
@Table(name = "ORDER_ITEM")
public class Orders {
	private Integer orderId; // ID; //	NUMBER(10,0)
	private Integer amount;// AMOUNT; //	NUMBER(5,2)
	private Date createdDate; // CREATED_DATE
	//#######################################
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", amount=" + amount + "]";
	}

	@Id
	@Column(name ="ID")
	public Integer getOrderId() {
		return orderId;
	}
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}
	@Column(name ="AMOUNT")
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	@Column(name ="CREATED_DATE")
	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
