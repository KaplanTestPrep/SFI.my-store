package com.kaplan.coding.mystore.persistence.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.apache.log4j.Logger;

import com.kaplan.coding.mystore.business.test.TestProducts;

/**
 * 
 * @author IAhmed
 *
 */
@Entity
@Table(name = "ORDER_ITEM")
public class OrderItem implements Serializable{
    
    /**
     * 
     */
    private static final long serialVersionUID = 3527409010727340848L;
    private static final Logger log = Logger.getLogger(OrderItem.class);
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_ORDER_ITEM")
    @Column(name ="ORDER_ITEM_ID",scale=10)
    private Integer orderItemId; // ORDER_ITEM_ID;// NUMBER(10,0)
    
    @Column(name ="SOLD_QUANTITY",scale=5)
    private Integer quantity; // SOLD_QUANTITY;// NUMBER(5,0)
    
    @Column(name ="UNIT_PRICE",precision=2,scale=5)
    private double unitPrice; // UNIT_PRICE;// NUMBER(5,2)
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
                + ", unitPrice=" + unitPrice+" ]";
    }

    @Id
    // @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    public Integer getOrderItemId() {
        return orderItemId;
        //log.debug("Test");
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
    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // -------------------------
    @Column(name = "PRODUCT_SKU")
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    // ---------------
    @Column(name = "ORDER_ID")
    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

}
