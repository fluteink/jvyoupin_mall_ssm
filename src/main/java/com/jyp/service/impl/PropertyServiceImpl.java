package com.jyp.service.impl;

import com.jyp.mapper.PropertyMapper;
import com.jyp.pojo.Property;
import com.jyp.pojo.PropertyExample;
import com.jyp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/18 22:48
 */
@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public List<Property> getAllPropertyByCid(Integer cid) {
        PropertyExample propertyExample = new PropertyExample();
        propertyExample.createCriteria().andCidEqualTo(cid);
        List<Property> properties = propertyMapper.selectByExample(propertyExample);
        return properties;
    }

    @Override
    public String getPropertyNamesById(Integer id) {
        Property property = propertyMapper.selectByPrimaryKey(id);
        return property.getName();
    }

    @Override
    public void update(Property p) {
        propertyMapper.updateByPrimaryKeySelective(p);
    }

    @Override
    public void deleteproperty(Integer id) {
        propertyMapper.deleteByPrimaryKey(id);
    }
}
