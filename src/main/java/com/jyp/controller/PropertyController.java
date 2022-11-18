package com.jyp.controller;

import com.jyp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/18 22:46
 */
@Controller
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @RequestMapping("property/{id}")
    public String property() {
        return "admin/property_list";
    }

}
