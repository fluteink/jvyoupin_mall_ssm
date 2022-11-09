package com.jyp.controller;

import com.jyp.pojo.Category;
import com.jyp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/9 15:02
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @RequestMapping("addtest")
    public String testadd() {
        Category category = new Category();
        category.setName("name1");
        categoryService.testadd(category);
        return "success";
    }

}
