/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.kaplan.coding.mystore.persistence.dao.OrdersDAO;
import com.kaplan.coding.mystore.persistence.domain.Orders;

/**
 * @author NJahan
 *
 */
public class OrdersDAOImplementation implements OrdersDAO {

    private static final Logger log = Logger.getLogger(OrdersDAOImplementation.class);
    @Autowired
    @org.springframework.beans.factory.annotation.Qualifier("mySessionFactory")
    private SessionFactory sessionFactory;
    
    // ###########
    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.persistence.dao.OrdersDAO#save(com.kaplan.coding
     * .mystore.persistence.domain.Orders)
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
        //log.debug(Orders orders);
    }// #####################################################

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.persistence.dao.OrdersDAO#update(com.kaplan
     * .coding.mystore.persistence.domain.Orders)
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
    }// #####################################################

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.persistence.dao.OrdersDAO#findById(java.lang
     * .Integer)
     */
    @Override
    public Orders findById(Integer id) {
        Orders tempOrders = null;
        try {
            tempOrders = (Orders) this.sessionFactory.getCurrentSession()
                    .createCriteria(Orders.class)
                    .add(Restrictions.eq("orderId", id)).uniqueResult();
            return tempOrders;
        } catch (Exception e) {
            return tempOrders;
        }
    }// #####################################################

    /*
     * (non-Javadoc)
     * 
     * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#getAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Orders> getAll() {
        return (List<Orders>) this.sessionFactory.getCurrentSession().createCriteria(Orders.class).list();

    }// #####################################################

    @Override
    public Boolean saveOrUpdate(Orders orders) {
        Boolean returnBoolean = false;
        try {
            this.sessionFactory.getCurrentSession().saveOrUpdate(orders);
            returnBoolean = true;
        } catch (Exception e) {
        }
        return returnBoolean;
    }// #####################################################

    @Override
    public void delete(Orders orders) {
        sessionFactory.getCurrentSession().delete(orders);

    }// #####################################################

    @Override
    public List<Orders> findByExamples(Orders instance) {
        // TODO Auto-generated method stub
        return null;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Orders> findByProperty(String propertyName, Object value) {
        return this.sessionFactory.getCurrentSession().createCriteria(Orders.class).add(Restrictions.eq(propertyName, value)).list();
    }
}// ##############--End of
// OrdersDAOImplementation--#######################################
