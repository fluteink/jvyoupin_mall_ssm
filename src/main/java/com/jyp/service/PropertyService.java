package com.jyp.service;

import com.jyp.pojo.Property;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/18 22:47
 */

public interface PropertyService {
    List<Property> getAllPropertyByCid(Integer cid);

    String getPropertyNamesById(Integer id);

    void update(Property p);

    void deleteproperty(Integer id);

    void addProperty(Property p);
}
