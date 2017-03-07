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
import org.springframework.web.servlet.ModelAndView;

import com.kaplan.coding.mystore.business.impl.OrdersService;
import com.kaplan.coding.mystore.business.impl.ProductService;
import com.kaplan.coding.mystore.business.vo.OrdersVO;
import com.kaplan.coding.mystore.business.vo.ProductVo;

@Controller
@RequestMapping(value = "/orders/*")
public class OrdersController {
private static final Logger log = Logger.getLogger(OrdersController.class);
	
	@Autowired
	private OrdersService ordersService;
	
	@RequestMapping(value="listAllOrdersVO.htm", method=RequestMethod.GET)
	public ModelAndView getAllOrdersVO(HttpServletRequest request, ModelMap modelMap
			//@RequestParam(value="maxResults", required=false) final Integer maxResults
			){
		
		log.debug("Show all orderss in inventory");
		List<OrdersVO> list = new ArrayList<OrdersVO>();
		try {
			list = this.ordersService.getAllOrdersVO();
			modelMap.put("KEY_LIST_ITEMS", list);
		} catch (Exception ex) {
			log.error(ex);
		}		
		modelMap.put("KEY_METHOD", "getAllOrdersVO");	
		ModelAndView modelAndView = new ModelAndView("admin_Orders_List_Orders",modelMap);
		log.info("Returning modelAndView="+modelAndView);
		return modelAndView;
	}
	
}
