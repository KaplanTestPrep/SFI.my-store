/**
 * 
 */
package java.com.kaplan.coding.mystore.test;

import org.apache.log4j.xml.DOMConfigurator;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Configuration;


/**
 * @author NJahan
 *
 */

@RunWith(SpringJUnit4ClassRunner.class)
@Configuration(locations = {
        "file:src/main/webapp/WEB-INF/spring/daoApplicationContext.xml", 
        "file:src/main/webapp/WEB-INF/spring/serviceApplicationContext.xml" })


public class TestProductService {
    
    
    static  {
        DOMConfigurator.configure("src/main/webapp/WEB-INF/log4j/log4j-config-minimal.xml");
    }
    
    
    

}
