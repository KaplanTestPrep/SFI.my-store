package com.kaplan.coding.mystore.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * 
 * @author IAhmed
 *
 */
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem {
    private Integer orderItemId; // ORDER_ITEM_ID;// NUMBER(10,0)
    private Integer quantity; // SOLD_QUANTITY;// NUMBER(5,0)
    private Integer unitPrice; // UNIT_PRICE;// NUMBER(5,2)
    // private Integer productSku; //PRODUCT_SKU;// NUMBER(20,0)

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRODUCT_SKU", nullable = false, insertable = false, updatable = false)
    private Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID", nullable = false, insertable = false, updatable = false)
    private Orders orders;

    // private Integer orderId; // ORDER_ID; // NUMBER(10,0)
    // ###########################
    public OrderItem(Integer orderItemId, Integer qantity, Integer unitPrice,
            Integer productSku, Integer orderId) {
        super();
        this.orderItemId = orderItemId;
        this.quantity = qantity;
        this.unitPrice = unitPrice;
        // this.productSku = productSku;
        // this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderItem [orderItemId=" + orderItemId + ", antity=" + quantity
                + ", unitPrice=" + unitPrice;
    }

    @Id
    // @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    public Integer getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(Integer orderItemId) {
        this.orderItemId = orderItemId;
    }

    // ---------------------------
    @Column(name = "SOLD_QUANTITY")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // ------------------------------
    @Column(name = "UNIT_PRICE")
    public Integer getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }

    // -------------------------
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // ---------------
    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

}
