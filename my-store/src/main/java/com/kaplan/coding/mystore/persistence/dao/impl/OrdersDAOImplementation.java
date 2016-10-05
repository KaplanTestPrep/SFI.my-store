/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import com.kaplan.coding.mystore.persistence.dao.OrdersDAO;
import com.kaplan.coding.mystore.persistence.domain.Orders;

/**
 * @author NJahan
 *
 */
public class OrdersDAOImplementation implements OrdersDAO {
    
    @Autowired
    @Qualifier("oracleSessionFactory")
    private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#save(com.kaplan.coding.mystore.persistence.domain.Orders)
	 * 
	 */
	@Override
	public Boolean save(Orders orders) {
	    Boolean returnBoolean;
	    try {
	        this.sessionFactory.getCurrentSession().save(orders);
	        returnBoolean = true;
        } catch (Exception e) {
            returnBoolean = false;
        }
		return returnBoolean; // return a boolean
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#update(com.kaplan.coding.mystore.persistence.domain.Orders)
	 */
	@Override
	public Boolean update(Orders orders) {
	    Boolean returnBoolean;
        try {
            this.sessionFactory.getCurrentSession().update(orders);
            returnBoolean = true;
        } catch (Exception e) {
            returnBoolean = false;
        }
        return returnBoolean; // return a boolean
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#findById(java.lang.Integer)
	 */
	@Override
	public Orders findById(Integer id) {
	    Orders tempOrders = null;
	    try {
	        tempOrders =    (Orders) this.sessionFactory.getCurrentSession().get(Orders.class, id);
        } catch (Exception e) {
            // TODO: handle exception
        }
		// TODO Auto-generated method stub
		return tempOrders;
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#getAll()
	 */
	@Override
	public List<Orders> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Orders orders) {
		// TODO Auto-generated method stub
		this.sessionFactory.getCurrentSession().saveOrUpdate(orders);
		
	}
}
