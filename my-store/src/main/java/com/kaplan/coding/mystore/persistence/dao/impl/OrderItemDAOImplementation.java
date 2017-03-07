/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.kaplan.coding.mystore.persistence.dao.OrderItemDAO;
import com.kaplan.coding.mystore.persistence.domain.OrderItem;

/**
 * @author IAhmed
 *
 */
public class OrderItemDAOImplementation implements OrderItemDAO {
    
    @Autowired
    @Qualifier("mySessionFactory")
    private SessionFactory sessionFactory;
    
    @Override
    public void save(OrderItem orderItem) {
        this.sessionFactory.getCurrentSession().save(orderItem);
        
    }

    @Override
    public void update(OrderItem orderItem) {
        this.sessionFactory.getCurrentSession().update(orderItem);    
    }

    @Override
    public OrderItem findById(Integer id) {
        return (OrderItem) this.sessionFactory.getCurrentSession().get(OrderItem.class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<OrderItem> getAll() {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(OrderItem.class);
        return criteria.list();
    }

    @Override
    public void saveOrUpdate(OrderItem orderItem) {
        this.sessionFactory.getCurrentSession().saveOrUpdate(orderItem);
        
    }

    @Override
    public void delete(OrderItem orderItem) {
        this.sessionFactory.getCurrentSession().delete(orderItem);
        
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<OrderItem> findByExample(OrderItem orderItem) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(OrderItem.class);
        criteria.addOrder(Order.desc("ID"));
        return criteria.add(Example.create(orderItem)).list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<OrderItem> findByProperty(String PropertyName, Object value) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(OrderItem.class);
        return criteria.add(Restrictions.eq(PropertyName, value)).list();
    }

}
