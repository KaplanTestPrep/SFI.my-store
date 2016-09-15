package com.kaplan.coding.mystore.persistence.domain;

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
@Table(name = "PRODUCT")
public class Product {

	private Integer sku; //SKU; // NUMBER(10,0)
	private String name; //NAME; // VARCHAR2(20 BYTE)
	private Integer quantity; //QUANTITY; // NUMBER(5,0)
	private Integer unitPrice; //UNIT_PRICE; // NUMBER(5,2)
	//#############################
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", name=" + name + ", quantity="
				+ quantity + ", unitPrice=" + unitPrice + "]";
	}
	@Id
	@Column(name ="SKU")
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}//------------------
	@Column(name ="NAME")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}//---------------------
	@Column(name ="QUANTITY")
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}//--------------------
	@Column(name ="UNIT_PRICE")
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
