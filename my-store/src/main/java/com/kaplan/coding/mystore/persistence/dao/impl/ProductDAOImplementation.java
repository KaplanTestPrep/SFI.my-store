/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
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
    //@Qualifier("oracleSessionFactory")
    private SessionFactory sessionFactory;
    //private Session currentSession = sessionFactory.getCurrentSession();

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.persistence.dao.ProductDAO#save(com.kaplan.
     * coding.mystore.persistence.domain.Product)
     */
    
    
    @Override
    public void save(Product product) {

        this.sessionFactory.getCurrentSession().save(product);

    }

    /**
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.persistence.dao.ProductDAO#update(com.kaplan.
     * coding.mystore.persistence.domain.Product)
     */
    @Override
    public void update(Product product) {

        this.sessionFactory.getCurrentSession().update(product);

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.persistence.dao.ProductDAO#findById(java.lang.
     * Integer)
     */
    @Override
    public Product findById(Integer sku) {

        return (Product) this.sessionFactory.getCurrentSession().get(Product.class, sku);

    }

    /*
     * (non-Javadoc)
     * 
     * @see com.kaplan.coding.mystore.persistence.dao.ProductDAO#getAll()
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<Product> getAll() {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Product.class);

        return criteria.list();

    }

    @Override
    public void saveOrUpdate(Product product) {

        this.sessionFactory.getCurrentSession().saveOrUpdate(product);

    }

    @Override
    public void delete(Product product) {

        this.sessionFactory.getCurrentSession().delete(product);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product> findByExample(Product product) {
        
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Product.class);
        criteria.addOrder(Order.desc("sku"));
        return criteria.add(Example.create(product)).list();

    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Product> findByProperty(String PropertyName, Object value) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Product.class);
        return criteria.add(Restrictions.eq(PropertyName, value)).list();
    }
}
