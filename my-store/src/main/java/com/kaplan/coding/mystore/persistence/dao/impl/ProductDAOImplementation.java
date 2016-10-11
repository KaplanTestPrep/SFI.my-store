/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

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
	public Boolean save(Product product) {
		 Boolean returnBoolean;
		 try{
		this.sessionFactory.getCurrentSession().save(product);
		returnBoolean = true;
		}
		 catch (Exception e) {
	            returnBoolean = false;
	        }
		return returnBoolean; // return a boolean
     
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#update(com.kaplan.coding.mystore.persistence.domain.Product)
	 */
	@Override
	public Boolean update(Product product) {
		
		Boolean returnBoolean;
        try {
		this.sessionFactory.getCurrentSession().update(product);
		returnBoolean = true;
        } 
        catch (Exception e) {
            returnBoolean = false;
        }
        return returnBoolean; // return a boolean
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#findById(java.lang.Integer)
	 */
	@Override
	public Product findById(Integer id) {
		
		Product tempProduct = null;
	    try {
	    	tempProduct =    (Product) this.sessionFactory.getCurrentSession().get(Product.class, id);
        } catch (Exception e) {
            // TODO: handle exception
        }
		// TODO Auto-generated method stub
		return tempProduct;
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
	public Boolean saveOrUpdate(Product product) {
		Boolean returnBoolean;
        try {
            this.currentSession.saveOrUpdate(product);            
            returnBoolean = true;
        } catch (Exception e) {
            returnBoolean = false;
        }
        return returnBoolean;
		
		
	}
	
	@Override
	public void delete(Product product){
		
		this.sessionFactory.getCurrentSession().delete(product);
	}
	
	
	
	
}
