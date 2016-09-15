package com.kaplan.coding.mystore.persiste.domain;

public class Product {
	
	private Integer SKU; // NUMBER(10,0)
	private String NAME; // VARCHAR2(20 BYTE)
	private Integer QUANTITY; // NUMBER(5,0)
	private Integer UNIT_PRICE; // NUMBER(5,2)
	
	public Integer getSKU() {
		return SKU;
	}
	public void setSKU(Integer sKU) {
		SKU = sKU;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public Integer getQUANTITY() {
		return QUANTITY;
	}
	public void setQUANTITY(Integer qUANTITY) {
		QUANTITY = qUANTITY;
	}
	public Integer getUNIT_PRICE() {
		return UNIT_PRICE;
	}
	public void setUNIT_PRICE(Integer uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}


}
