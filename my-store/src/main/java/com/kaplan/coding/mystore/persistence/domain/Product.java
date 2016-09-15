package com.kaplan.coding.mystore.persistence.domain;
public class Product {

	private Integer sku; //SKU; // NUMBER(10,0)
	private String name; //NAME; // VARCHAR2(20 BYTE)
	private Integer quantity; //QUANTITY; // NUMBER(5,0)
	private Integer unitPrice; //UNIT_PRICE; // NUMBER(5,2)
	//#############################
	public Integer getSku() {
		return sku;
	}
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", name=" + name + ", quantity="
				+ quantity + ", unitPrice=" + unitPrice + "]";
	}
	public void setSku(Integer sku) {
		this.sku = sku;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
