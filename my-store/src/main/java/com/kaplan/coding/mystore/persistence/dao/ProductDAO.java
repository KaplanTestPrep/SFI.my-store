package com.kaplan.coding.mystore.persistence.dao;

import java.util.List;

import com.kaplan.coding.mystore.persistence.domain.Product;

/**
 * Interface for Product Dao
 * 
 * @author JuMehta
 *
 */

public interface ProductDAO {

	/**
	 * Method to save Product
	 * 
	 * @param product
	 * @return 
	 */

	public void save(Product product);

	/**
	 * Method to update Product
	 * 
	 * @param product
	 */
	
	public void update(Product product);
	/**
	 * Method to find product by ID
	 * 
	 * @param id
	 */
	public Product findById(Integer id);
	/**
	 * Method to get all the products
	 * 
	 */
	public List<Product> getAll();
	public void saveOrUpdate(Product product);
	/**
	 * Method to save or update Product
	 * 
	 * @param product
	 */
    public void delete(Product product);
    /**
	 * Method to delete Product
	 * 
	 * @param product
	 */

	public List<Product> findByExample(Product product);

    public List<Product> findByProperty(String PropertyName, Object value);
}

