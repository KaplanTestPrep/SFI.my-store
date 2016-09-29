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
	    //true/false  save/update ||or save or update | delete 
	    this.sessionFactory.getCurrentSession().save(orders);
		// TODO Auto-generated method stu
		return null; // return a boolean
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#update(com.kaplan.coding.mystore.persistence.domain.Orders)
	 */
	@Override
	public Boolean update(Orders orders) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#findById(java.lang.Integer)
	 */
	@Override
	public Orders findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#getAll()
	 */
	@Override
	public List<Orders> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
