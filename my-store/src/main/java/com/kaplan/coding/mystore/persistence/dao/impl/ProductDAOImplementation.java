/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import com.kaplan.coding.mystore.persistence.dao.ProductDAO;
import com.kaplan.coding.mystore.persistence.domain.Product;

/**
 * @author JuMehta
 *
 */
public class ProductDAOImplementation implements ProductDAO {

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#save(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub

	}
	public void Update(){
		
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#update(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public void saveOrUpdate(Product product) {
		
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#findById(java.lang.Integer)
	 */
	@Override
	public Product findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#getAll()
	 */
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
