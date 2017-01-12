package com.kaplan.coding.mystore.business.test;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.kaplan.coding.mystore.business.impl.ProductService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/daoApplicationContext.xml",
        "file:src/main/webapp/WEB-INF/spring/serviceApplicationContext.xml" })
public class TestProducts {
    @Autowired
    private ProductService productService ;
    private static final Logger log = Logger.getLogger(TestProducts.class);
    
    static{DOMConfigurator.configure("src/main/webapp/WEB-INF/log4j/log4j-config-minimal.xml");}
   
    @SuppressWarnings("null")
    @Test
    
    public void testingProduct(){
        
        ProductService testProductService = null;
        log.debug("test products");
        testProductService.getAllProducts(); 
        
       
    }

}
