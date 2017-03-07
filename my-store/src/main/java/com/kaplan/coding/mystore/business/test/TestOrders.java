/**
 * 
 */
package com.kaplan.coding.mystore.business.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kaplan.coding.mystore.business.impl.OrdersService;


/**
 * @author NJahan
 *
 */


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/daoApplicationContext.xml",
        "file:src/main/webapp/WEB-INF/spring/serviceApplicationContext.xml" })
public class TestOrders {
    
    @Autowired
    private OrdersService ordersService;
    private static final Logger log = Logger.getLogger(TestOrders.class);

    static {
        log.debug("loading Log4J Config");
        DOMConfigurator.configure("src/main/webapp/WEB-INF/log4j/log4j-config-minimal.xml");
        log.debug("Log4J Config loaded");
    }

    @Test
    public void testingOrders() {
        log.debug("test retrieving orders - Invoke OrdersService");
        log.debug(ordersService.getAllOrdersVO());
        
    }

}
