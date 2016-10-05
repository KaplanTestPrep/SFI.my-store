/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao;

import java.util.List;

import com.kaplan.coding.mystore.persistence.domain.Orders;


/**
 *  * Interface for Order DAO
 * @author Jmehta
 *
 */
public interface OrdersDAO {
	
	/**
	 * Method for saving Orders.
	 * @param orders
	 */
	public Boolean save(Orders orders);
	
	/**
	 * Method for updating Orders.
	 * @param orders
	 */
	public Boolean update(Orders orders);
	
	/**
	 * Method for reading Orders.
	 * @param orders
	 */

	public Orders findById(Integer id);
	
	/**
	 * Method for getting list of all Orders.
	 * @param orders
	 */

	public List<Orders> getAll();

	
	/**
	 * Method for saving or updating Orders.
	 * @param orders
	 */
	public void saveOrUpdate(Orders orders);

	void delete(Orders orders);
	/**
	 * Method for delete Orders.
	 * @param orders
	 */

}
