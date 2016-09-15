package com.kaplan.coding.mystore.persiste.domain;

public class OrderItem {
	private Integer ORDER_ITEM_ID;//	NUMBER(10,0)
	private Integer SOLD_QUANTITY;//	NUMBER(5,0)
	private Integer UNIT_PRICE;//	NUMBER(5,2)
	private Integer PRODUCT_SKU;//	NUMBER(20,0)
	private Integer ORDER_ID; //	NUMBER(10,0)
	public Integer getORDER_ITEM_ID() {
		return ORDER_ITEM_ID;
	}
	public void setORDER_ITEM_ID(Integer oRDER_ITEM_ID) {
		ORDER_ITEM_ID = oRDER_ITEM_ID;
	}
	public Integer getSOLD_QUANTITY() {
		return SOLD_QUANTITY;
	}
	public void setSOLD_QUANTITY(Integer sOLD_QUANTITY) {
		SOLD_QUANTITY = sOLD_QUANTITY;
	}
	public Integer getUNIT_PRICE() {
		return UNIT_PRICE;
	}
	public void setUNIT_PRICE(Integer uNIT_PRICE) {
		UNIT_PRICE = uNIT_PRICE;
	}
	public Integer getPRODUCT_SKU() {
		return PRODUCT_SKU;
	}
	public void setPRODUCT_SKU(Integer pRODUCT_SKU) {
		PRODUCT_SKU = pRODUCT_SKU;
	}
	public Integer getORDER_ID() {
		return ORDER_ID;
	}
	public void setORDER_ID(Integer oRDER_ID) {
		ORDER_ID = oRDER_ID;
	}

}
