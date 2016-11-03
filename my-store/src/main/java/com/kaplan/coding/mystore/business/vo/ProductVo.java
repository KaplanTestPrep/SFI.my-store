/**
 * 
 */
package com.kaplan.coding.mystore.business.vo;

import java.io.Serializable;

/**
 * @author NJahan
 *
 */
public class ProductVo implements Serializable {

    private static final long serialVersionUID = -5122292678210156817L;

    private Integer productSku;

    private String productName;

    private Integer availableQuantity;

    private Integer productUnitPrice;

    /**
     * @return the productSku
     */
    public Integer getProductSku() {
        return productSku;
    }

    /**
     * @param productSku
     *            the productSku to set
     */
    public void setProductSku(Integer productSku) {
        this.productSku = productSku;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName
     *            the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the availableQuantity
     */
    public Integer getAvailableQuantity() {
        return availableQuantity;
    }

    /**
     * @param availableQuantity
     *            the availableQuantity to set
     */
    public void setAvailableQuantity(Integer availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    /**
     * @return the productUnitPrice
     */
    public Integer getProductUnitPrice() {
        return productUnitPrice;
    }

    /**
     * @param productUnitPrice
     *            the productUnitPrice to set
     */
    public void setProductUnitPrice(Integer productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "ProductVo [productSku=" + productSku + ", productName="
                + productName + ", availableQuantity=" + availableQuantity
                + ", productUnitPrice=" + productUnitPrice + "]";
    }

}
