package com.jyp.service.impl;

import com.jyp.mapper.ProductMapper;
import com.jyp.pojo.Product;
import com.jyp.pojo.ProductExample;
import com.jyp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/20 16:03
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductMapper productMapper;

    @Override
    public List<Product> getProductsByCid(Integer cid) {
        ProductExample productExample = new ProductExample();
        productExample.createCriteria().andCidEqualTo(cid);
        List<Product> products = productMapper.selectByExample(productExample);
        return products;
    }

    @Override
    public void addProduct(Product p) {
        productMapper.insert(p);
    }

    @Override
    public void deleteProductById(Integer id) {
        productMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Product findproductByPid(Integer pid) {
        Product product = productMapper.selectByPrimaryKey(pid);
        return product;
    }

    @Override
    public void update(Product p) {
        productMapper.updateByPrimaryKeySelective(p);
    }

    @Override
    public Product selectByid(Integer id) {
        Product product = productMapper.selectByPrimaryKey(id);
        return product;
    }
}
