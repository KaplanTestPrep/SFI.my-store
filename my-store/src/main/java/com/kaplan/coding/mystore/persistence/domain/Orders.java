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
	@Id
	@Column(name ="ID")
	private Integer orderId; // ID; //	NUMBER(10,0)
	@Column(name ="AMOUNT")
	private Integer amount;// AMOUNT; //	NUMBER(5,2)
	@Column(name ="CREATED_DATE")
	private Date createdDate; // CREATED_DATE
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

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
}
