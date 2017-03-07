package com.kaplan.coding.mystore.persistence.dao;

import java.util.List;

import com.kaplan.coding.mystore.persistence.domain.OrderItem;

public interface OrderItemDAO {


    public void save(OrderItem orderItem);

    /**
     * Method to update Product
     * 
     * @param product
     */
    
    public void update(OrderItem orderItem);
    /**
     * Method to find product by ID
     * 
     * @param id
     */
    public OrderItem findById(Integer id);
    /**
     * Method to get all the products
     * 
     */
    public List<OrderItem> getAll();
    
    public void saveOrUpdate(OrderItem orderItem);
    /**
     * Method to save or update Product
     * 
     * @param product
     */
    public void delete(OrderItem orderItem);
    /**
     * Method to delete Product
     * 
     * @param product
     */

    public List<OrderItem> findByExample(OrderItem orderItem);

    public List<OrderItem> findByProperty(String PropertyName, Object value);
}
