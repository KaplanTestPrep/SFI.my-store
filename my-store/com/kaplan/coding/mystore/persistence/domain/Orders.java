package com.kaplan.coding.mystore.persiste.domain;

import java.util.Date;

public class Orders {
	
	private Integer ID; //	NUMBER(10,0)
	private Integer AMOUNT; //	NUMBER(5,2)
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public Integer getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(Integer aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public Date getCREATED_DATE() {
		return CREATED_DATE;
	}
	public void setCREATED_DATE(Date cREATED_DATE) {
		CREATED_DATE = cREATED_DATE;
	}
	private Date CREATED_DATE; //	DATE

}