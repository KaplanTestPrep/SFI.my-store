/**
 * 
 */
package com.kaplan.coding.mystore.persistence.dao;

import java.util.List;

import com.kaplan.coding.mystore.persistence.domain.Orders;


/**
 *  * Interface for Order DAO
 * @author NJahan
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
	
	
	
	
	
	
	
	
	
	
	
	
	

}
