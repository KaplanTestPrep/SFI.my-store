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
	 */

	public void save(Product product);

	public Boolean update(Product product);

	public Product findById(Integer id);

	public List<Product> getAll();

}
