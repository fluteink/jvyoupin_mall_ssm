package com.jyp.service;

import com.jyp.pojo.Product;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/20 16:03
 */
public interface ProductService {
    List<Product> getProductsByCid(Integer cid);

    void addProduct(Product p);

    void deleteProductById(Integer id);

    Product findproductByPid(Integer pid);

    void update(Product p);

    Product selectByid(Integer id);
}
