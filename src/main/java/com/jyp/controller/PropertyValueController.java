package com.jyp.controller;

import com.jyp.service.PropertyValueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/21 22:21
 */
@Controller
public class PropertyValueController {
    @Autowired
    PropertyValueService propertyValueService;

    @RequestMapping("productproperty/{pid}")
    public String productproperty() {
        return "admin/Property_value_list";
    }

    @RequestMapping("findProductProperty/{pid}/{ptid}")//pid=product,ptid=property
    @ResponseBody
    public String findProductProperty(@PathVariable("pid") Integer pid, @PathVariable("ptid") Integer ptid) {
        String productProperty = propertyValueService.findProductProperty(pid, ptid);
        return productProperty;
    }
}
