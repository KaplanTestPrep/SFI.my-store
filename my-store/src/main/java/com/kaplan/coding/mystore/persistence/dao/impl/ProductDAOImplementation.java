/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.kaplan.coding.mystore.persistence.dao.ProductDAO;
import com.kaplan.coding.mystore.persistence.domain.Product;

/**
 * @author JMehta
 * @param <returnBoolean>
 *
 */
public class ProductDAOImplementation<returnBoolean> implements ProductDAO {

	@Autowired
    @Qualifier("oracleSessionFactory")
	private SessionFactory sessionFactory;
    private Session currentSession = sessionFactory.getCurrentSession();

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#save(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public void save(Product product) {
		 
		this.sessionFactory.getCurrentSession().save(product);

     
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#update(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public void update(Product product) {
		
		
		this.sessionFactory.getCurrentSession().update(product);
		
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#findById(java.lang.Integer)
	 */
	@Override
	public Product findById(Integer sku) {
		
		Product tempProduct = null;
	   
	    	return tempProduct =    (Product) this.sessionFactory.getCurrentSession().get(Product.class, sku);
        
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#getAll()
	 */
	@Override
	public List<Product> getAll() {
		Criteria criteria = this.sessionFactory.getCurrentSession()
				.createCriteria(Product.class);
	
		
		return null;
		
		
	}
	
	@Override
	public void saveOrUpdate(Product product) {
		
            this.currentSession.saveOrUpdate(product);            
            
		
	}
	
	@Override
	public void delete(Product product){
		
		this.sessionFactory.getCurrentSession().delete(product);
	}
	
	@Override
	public List<Product> findByExample (Product product){
		return null;
		
	}
	@Override
	public List<Product> findByProperty(Product product){
		return null;
		
	}
	
	
}
