/**
 * 
 */
package com.kaplan.coding.mystore.business.impl;

import java.util.ArrayList;
import java.util.List;

import com.kaplan.coding.mystore.business.vo.ProductVo;
import com.kaplan.coding.mystore.persistence.dao.ProductDAO;
import com.kaplan.coding.mystore.persistence.domain.Product;

/**
 * @author NJahan
 *
 */
public class ProductServiceImplementation implements ProductService {
    private ProductDAO productDAO; 

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.business.impl.ProductService#getAllProducts()
     */
   
    @Override
    public List<ProductVo> getAllProducts() {
        List<ProductVo> results = new ArrayList<ProductVo>();
       
        List<Product> productsList = this.productDAO.getAll();
        for(Product pojo : productsList){
            ProductVo productVo = new ProductVo();
            productVo.setProductSku(pojo.getSku());
            //TODO: Transfor Pojo into VO here
            results.add(productVo);
        }
 
        return results;
        
        
        
        
        
    }

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.business.impl.ProductService#updateProduct(com.kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean updateProduct(ProductVo productVo) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.business.impl.ProductService#saveProduct(com.kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean saveProduct(ProductVo productVo) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.kaplan.coding.mystore.business.impl.ProductService#deleteProduct(com.kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean deleteProduct(ProductVo productVo) {
        // TODO Auto-generated method stub
        return null;
    }

}
