/**
 * 
 */
package com.kaplan.coding.mystore.business.util;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Test;

import com.kaplan.coding.mystore.business.test.TestProducts;
import com.kaplan.coding.mystore.business.vo.ProductVo;
import com.kaplan.coding.mystore.persistence.domain.Product;


/**
 * @author NJahan
 *
 */
public final class Transformer {
    private static final Logger log = Logger.getLogger(Transformer.class);
    static{DOMConfigurator.configure("src/main/webapp/WEB-INF/log4j/log4j-config-minimal.xml");}
    
    

    public static ProductVo convert(Product product ){
        return null;
        //TODO: add code here!!!
        
       //log.debug("TEST");
      
        
    }
    
    
    
    
}
