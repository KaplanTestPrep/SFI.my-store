/**
 * 
 */
package com.kaplan.coding.mystore.business.impl;

import java.util.List;

import com.kaplan.coding.mystore.business.vo.ProductVo;

/**
 * @author NJahan
 *
 */
public interface ProductService {

    public List<ProductVo> getAllProducts();

    public Boolean updateProduct(ProductVo productVo);

    public Boolean saveProduct(ProductVo productVo);

    public Boolean deleteProduct(ProductVo productVo);

}
