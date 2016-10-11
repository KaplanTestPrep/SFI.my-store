/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
    private Session currentSession = sessionFactory.getCurrentSession();
    //###########
    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#save(com.kaplan.coding.mystore.persistence.domain.Orders)
     * 
     */
    @Override
    public Boolean save(Orders orders) {
        Boolean returnBoolean;
        try {
            this.currentSession.save(orders);
            returnBoolean = true;
        } catch (Exception e) {
            returnBoolean = false;
        }
        return returnBoolean; // return a boolean
    }//#####################################################

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#update(com.kaplan.coding.mystore.persistence.domain.Orders)
     */
    @Override
    public Boolean update(Orders orders) {
        Boolean returnBoolean;
        try {
            this.currentSession.update(orders);
            returnBoolean = true;
        } catch (Exception e) {
            returnBoolean = false;
        }
        return returnBoolean; // return a boolean
    }//#####################################################

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#findById(java.lang.Integer)
     */
    @Override
    public Orders findById(Integer id) {
        Orders tempOrders = null;
        try {
            tempOrders = (Orders) this.currentSession.createCriteria(Orders.class).add(Restrictions.eq("ID",id)).uniqueResult(); 
            return tempOrders;
        } catch (Exception e) {
            return tempOrders;
        }
    }//#####################################################

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.persistence.dao.OrdersDAO#getAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Orders> getAll() {
        List<Orders> tempOrdersList = new ArrayList<Orders>();
        try {
            tempOrdersList = (List<Orders>) currentSession.createCriteria(Orders.class).list();
            return tempOrdersList;
        } catch (Exception e) {
            return tempOrdersList;
        }

    }//#####################################################

    @Override
    public void saveOrUpdate(Orders orders) {
        // TODO Auto-generated method stub
        this.sessionFactory.getCurrentSession().saveOrUpdate(orders);

    }//#####################################################

    @Override
    public void delete(Orders orders) {
        Orders result = (Orders) this.currentSession.createCriteria(Orders.class).add(Restrictions.idEq(orders.getOrderId())).uniqueResult();  

        if (result != null)  
        {  
            currentSession.delete(result);  
        } 

    }//#####################################################
}//##############--End of OrdersDAOImplementation--#######################################
