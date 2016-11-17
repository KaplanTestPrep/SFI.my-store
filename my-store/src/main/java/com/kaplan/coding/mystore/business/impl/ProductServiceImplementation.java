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

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.kaplan.coding.mystore.business.impl.ProductService#getAllProducts()
     */

    @Override
    public List<ProductVo> getAllProducts() {
        List<ProductVo> productVoList = new ArrayList<ProductVo>();
        List<Product> result = this.productDAO.getAll();
        for (int i = 0; i < result.size(); i++) {
            ProductVo tempProductVo = new ProductVo();
            tempProductVo.setProductSku(result.get(i).getSku());
            tempProductVo.setProductName(result.get(i).getName());
            tempProductVo.setProductUnitPrice(result.get(i).getUnitPrice());
            tempProductVo.setAvailableQuantity(result.get(i).getQuantity());
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
     * com.kaplan.coding.mystore.business.impl.ProductService#saveProduct(com
     * .kaplan.coding.mystore.business.vo.ProductVo)
     */
    @Override
    public Boolean saveProduct(ProductVo productVo) {
        // TODO Auto-generated method stub
        return null;
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
        // TODO Auto-generated method stub
        return null;
    }

}
