package com.jyp.controller;

import com.jyp.pojo.Property;
import com.jyp.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/18 22:46
 */
@Controller
public class PropertyController {
    @Autowired
    PropertyService propertyService;

    @RequestMapping("admin_property_update")
    public String update(Property p) {
        propertyService.update(p);
        return "redirect:/admin";
    }

    @RequestMapping("admin_property_add")
    public String addProperty(Property p) {
        propertyService.addProperty(p);
        return "redirect:/admin";
    }


    @RequestMapping("property/{id}")
    public String property() {
        return "admin/property_list";
    }

    @RequestMapping("listproperty/{cid}")
    @ResponseBody
    public List<Property> getAllProperty(@PathVariable("cid") Integer cid) {
        List<Property> allPropertyByCid = propertyService.getAllPropertyByCid(cid);
        return allPropertyByCid;
    }

    @RequestMapping("property/edit/{id}")
    public String testedit() {
        return "admin/property_edit";
    }

    @RequestMapping("findproperty/{id}")
    @ResponseBody
    public String findpropertyByid(@PathVariable("id") Integer id) {
        String propertyNamesById = propertyService.getPropertyNamesById(id);
        return propertyNamesById;
    }

    @RequestMapping("deleteProperty/{id}")
    @ResponseBody
    public String deleteproperty(@PathVariable("id") Integer id) {
        propertyService.deleteproperty(id);
        return "200";
    }

}
