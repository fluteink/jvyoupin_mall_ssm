package com.jyp.service.impl;

import com.jyp.mapper.PropertyMapper;
import com.jyp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/18 22:48
 */
@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

}
