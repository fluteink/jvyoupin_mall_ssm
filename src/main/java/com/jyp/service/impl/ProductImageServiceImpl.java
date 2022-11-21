package com.jyp.service.impl;

import com.jyp.mapper.ProductImageMapper;
import com.jyp.pojo.ProductImage;
import com.jyp.pojo.ProductImageExample;
import com.jyp.service.ProductImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/20 20:42
 */
@Service
public class ProductImageServiceImpl implements ProductImageService {
    @Autowired
    ProductImageMapper productImageMapper;

    @Override
    public List<ProductImage> findSingleImageByPid(Integer pid) {
        ProductImageExample productImageExample = new ProductImageExample();
        productImageExample.createCriteria().andPidEqualTo(pid).andTypeLike("%single%");
        List<ProductImage> productImages = productImageMapper.selectByExample(productImageExample);
        return productImages;
    }

    @Override
    public List<ProductImage> findDetailImageByPid(Integer pid) {
        ProductImageExample productImageExample = new ProductImageExample();
        productImageExample.createCriteria().andPidEqualTo(pid).andTypeLike("%detail%");
        List<ProductImage> productImages = productImageMapper.selectByExample(productImageExample);
        return productImages;
    }

    @Override
    public void deleteImage(Integer piid) {
        productImageMapper.deleteByPrimaryKey(piid);
    }

    @Override
    public void addImage(ProductImage p) {
        productImageMapper.insert(p);
    }

    @Override
    public String findFirstProductImageId(Integer pid) {
        List<ProductImage> singleImageByPid = this.findSingleImageByPid(pid);
        if (singleImageByPid.isEmpty()) {
            return "0";
        } else {
            return "" + singleImageByPid.get(0).getId();
        }
    }
}
