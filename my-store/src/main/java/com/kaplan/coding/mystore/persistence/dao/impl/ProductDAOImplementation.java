/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;

import com.kaplan.coding.mystore.persistence.dao.ProductDAO;
import com.kaplan.coding.mystore.persistence.domain.Orders;
import com.kaplan.coding.mystore.persistence.domain.Product;

/**
 * @author JMehta
 *
 */
public class ProductDAOImplementation implements ProductDAO {
private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#save(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#update(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public Boolean update(Product product) {
		// TODO Auto-generated method stub
		return null;
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
	@Override
	public void saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}
}
