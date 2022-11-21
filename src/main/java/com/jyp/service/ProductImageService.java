package com.jyp.service;

import com.jyp.pojo.ProductImage;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/20 20:42
 */
public interface ProductImageService {
    List<ProductImage> findSingleImageByPid(Integer pid);

    List<ProductImage> findDetailImageByPid(Integer pid);

    void deleteImage(Integer piid);

    void addImage(ProductImage p);

    String findFirstProductImageId(Integer pid);
}
