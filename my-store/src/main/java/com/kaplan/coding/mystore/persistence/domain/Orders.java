package com.kaplan.coding.mystore.persistence.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author IAhmed
 *
 */
@Entity
@Table(name = "ORDERS")
public class Orders implements Serializable {
	/**
     * 
     */
    private static final long serialVersionUID = 3989204438621759507L;
    @Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ORDER")
	@Column(name ="ID")
	private Integer orderId; // ID; //	NUMBER(10,0)
	@Column(name ="AMOUNT",precision=2,scale=5)
	private Integer amount;// AMOUNT; //	NUMBER(5,2)
	@Column(name ="CREATED_DATE")
	private Date createdDate; // CREATED_DATE
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="orders")
    private Set<OrderItem> orderItem=new HashSet<OrderItem>(0);
	
	//#######################################

	public Integer getOrderId() {
		return orderId;
	}
	/* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Orders [orderId=" + orderId + ", amount=" + amount
                + ", createdDate=" + createdDate + ", orderItem=" + orderItem
                + "]";
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
