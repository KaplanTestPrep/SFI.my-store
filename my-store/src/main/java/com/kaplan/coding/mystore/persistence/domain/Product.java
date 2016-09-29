package com.kaplan.coding.mystore.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_PRODUCT")
	@Column(name ="SKU")
	private Integer sku; //SKU; // NUMBER(10,0)
	@Column(name ="NAME", unique=true, length=20)
	private String name; //NAME; // VARCHAR2(20 BYTE)
	@Column(name ="QUANTITY", precision = 5)
	private Integer quantity; //QUANTITY; // NUMBER(5,0)
	@Column(name ="UNIT_PRICE", precision = 5,scale = 2)
	private Integer unitPrice; //UNIT_PRICE; // NUMBER(5,2)
	//#############################
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", name=" + name + ", quantity="
				+ quantity + ", unitPrice=" + unitPrice + "]";
	}
	
	public Integer getSku() {
		return sku;
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}//------------------
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}//---------------------
	
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}//--------------------
	
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
