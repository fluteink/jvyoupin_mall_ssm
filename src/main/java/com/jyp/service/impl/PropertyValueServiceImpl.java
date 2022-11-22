package com.jyp.service.impl;

import com.jyp.mapper.PropertyValueMapper;
import com.jyp.pojo.PropertyValue;
import com.jyp.pojo.PropertyValueExample;
import com.jyp.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/21 22:23
 */
@Service
public class PropertyValueServiceImpl implements PropertyValueService {
    @Autowired
    PropertyValueMapper propertyValueMapper;

    @Override
    public String findProductProperty(Integer pid, Integer ptid) {
        PropertyValueExample propertyValueExample = new PropertyValueExample();
        propertyValueExample.createCriteria().andPidEqualTo(pid).andPtidEqualTo(ptid);
        List<PropertyValue> propertyValues = propertyValueMapper.selectByExample(propertyValueExample);
        if (!propertyValues.isEmpty()) {
            return propertyValues.get(0).getValue();
        } else {
            return null;
        }
    }
}
