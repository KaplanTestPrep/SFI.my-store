/**
 * 
 */
package com.kaplan.coding.mystore.business.impl;

import java.util.List;

import com.kaplan.coding.mystore.business.vo.ProductVo;
import com.kaplan.coding.mystore.persistence.dao.ProductDAO;

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
        // TODO Auto-generated method stub
        productDAO.getAll();
        return null;
        
        
        
        
        
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
