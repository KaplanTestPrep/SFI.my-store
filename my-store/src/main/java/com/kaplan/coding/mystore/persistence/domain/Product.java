package com.kaplan.coding.mystore.persistence.domain;

import java.io.Serializable;
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
@Table(name = "PRODUCT")
public class Product implements Serializable {

    /**
	 * 
	 */
    private static final long serialVersionUID = -3125255974783291950L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_PRODUCT")
    @Column(name = "SKU")
    private Integer sku; // SKU; // NUMBER(10,0)
    @Column(name = "NAME", unique = true, length = 20)
    private String name; // NAME; // VARCHAR2(20 BYTE)
    @Column(name = "QUANTITY", precision = 5)
    private Integer quantity; // QUANTITY; // NUMBER(5,0)
    @Column(name = "UNIT_PRICE", precision = 5, scale = 2)
    private Double unitPrice; // UNIT_PRICE; // NUMBER(5,2)

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "product")
    private Set<OrderItem> orderItem = new HashSet<OrderItem>(0);

    // #############################
    @Override
    public String toString() {
        return "Product [sku=" + sku + ", name=" + name + ", quantity="
                + quantity + ", unitPrice=" + unitPrice + "]";
    }

    @Id
    // @GeneratedValue
    @Column(name = "SKU")
    public Integer getSku() {
        return sku;
    }

    public void setSku(Integer sku) {
        this.sku = sku;
    }// ------------------

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }// ---------------------

    @Column(name = "QUANTITY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }// --------------------

    @Column(name = "UNIT_PRICE")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

}
