/**
 * 
 */
package com.kaplan.coding.mystore.business.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.kaplan.coding.mystore.business.vo.ProductVo;
import com.kaplan.coding.mystore.persistence.dao.ProductDAO;
import com.kaplan.coding.mystore.persistence.domain.Product;

/**
 * @author NJahan
 *
 */
public class ProductServiceImplementation implements ProductService {
	private static final Logger log = Logger.getLogger(ProductServiceImplementation.class);

	@Autowired()
	@Qualifier("productDAO")
	private ProductDAO productDAO;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kaplan.coding.mystore.business.impl.ProductService#getAllProducts()
	 */

	@Override
	@Transactional(readOnly=true)
	public List<ProductVo> getAllProducts() {
		log.debug("Retrieving all products");
		List<ProductVo> productVoList = new ArrayList<ProductVo>();
		List<Product> result = this.productDAO.getAll();
		log.debug("Result ="+result.size());
		for (Product product : result) {
			ProductVo tempProductVo = new ProductVo();
			tempProductVo.setProductSku(product.getSku());
			tempProductVo.setProductName(product.getName());
			tempProductVo.setProductUnitPrice(product.getUnitPrice());
			tempProductVo.setAvailableQuantity(product.getQuantity());
			productVoList.add(tempProductVo);
		}
		return productVoList;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kaplan.coding.mystore.business.impl.ProductService#updateProduct(
	 * com.kaplan.coding.mystore.business.vo.ProductVo)
	 */
	@Override
	public Boolean updateProduct(ProductVo productVo) {
		log.debug("Executing to update product!");
		try {
			Product tempProduct = new Product();
			tempProduct.setSku(productVo.getProductSku());
			tempProduct.setName(productVo.getProductName());
			tempProduct.setUnitPrice(productVo.getProductUnitPrice());
			tempProduct.setQuantity(productVo.getAvailableQuantity());
			this.productDAO.update(tempProduct);
			log.debug("Operation performed!");
			return true;
		} catch (Exception e) {
			log.error("Exception!!", e);
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kaplan.coding.mystore.business.impl.ProductService#saveProduct(com
	 * .kaplan.coding.mystore.business.vo.ProductVo)
	 */
	@Override
	public Boolean saveProduct(ProductVo productVo) {

		try {
			Product tempProduct = new Product();
			tempProduct.setSku(productVo.getProductSku());
			tempProduct.setName(productVo.getProductName());
			tempProduct.setUnitPrice(productVo.getProductUnitPrice());
			tempProduct.setQuantity(productVo.getAvailableQuantity());
			this.productDAO.save(tempProduct);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.kaplan.coding.mystore.business.impl.ProductService#deleteProduct(
	 * com.kaplan.coding.mystore.business.vo.ProductVo)
	 */
	@Override
	public Boolean deleteProduct(ProductVo productVo) {
		try {
			Product tempProduct = new Product();
			tempProduct.setSku(productVo.getProductSku());
			tempProduct.setName(productVo.getProductName());
			tempProduct.setUnitPrice(productVo.getProductUnitPrice());
			tempProduct.setQuantity(productVo.getAvailableQuantity());
			this.productDAO.delete(tempProduct);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
