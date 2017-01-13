
package com.kaplan.coding.mystore.web.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kaplan.coding.mystore.business.impl.ProductService;
import com.kaplan.coding.mystore.business.vo.ProductVo;

/**
 * @author jcruz
 * @since Jan 2017
 */
@Controller
@RequestMapping(value = "/products/*")
public class ProductsController {
	private static final Logger log = Logger.getLogger(ProductsController.class);
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value="listAllProducts.htm", method=RequestMethod.GET)
	public String getAllProducts(HttpServletRequest request, ModelMap modelMap
			//@RequestParam(value="maxResults", required=false) final Integer maxResults
			){
		
		log.debug("show all products in inventory");
		List<ProductVo> list = new ArrayList<ProductVo>();
		try {
			list = this.productService.getAllProducts();
			modelMap.put("KEY_LIST_ITEMS", list);
		} catch (Exception ex) {
			log.error(ex);
		}
						
		return "admin/products/list_products";
	}	

}
