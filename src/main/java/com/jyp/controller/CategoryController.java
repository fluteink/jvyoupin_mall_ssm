package com.jyp.controller;

import com.jyp.pojo.Category;
import com.jyp.service.CategoryService;
import com.jyp.util.ImageUtil;
import com.jyp.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/9 15:02
 */
@Controller
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @ResponseBody
    @RequestMapping("deleteCategory/{id}")
    public int deleteCategory(@PathVariable("id") Integer id) {
        categoryService.deleteCategory(id);
        return 200;
    }

    @RequestMapping("admin")
    public String list(Model model) {
        List<Category> allCategories = categoryService.getAllCategories();
        model.addAttribute("list", allCategories);
//        allCategories.forEach(System.out::println);
        return "admin/category_list";
    }


    @RequestMapping("/test/ResponseBody/json")
    @ResponseBody
    public List<Category> testResponseBodyJson() {
        List<Category> allCategories = categoryService.getAllCategories();
        return allCategories;
    }

    @RequestMapping("addtest")
    public String testadd() {
        Category category = new Category();
        category.setName("name1");
        categoryService.testadd(category);
        return "success";
    }

    @RequestMapping("admin_category_add")
    public String add(Category c, HttpSession session, UploadedImageFile uploadedImageFile) throws IOException {
        categoryService.add(c);
        File imageFolder = new File(session.getServletContext().getRealPath("img/category"));
        File file = new File(imageFolder, c.getId() + ".jpg");
        if (!file.getParentFile().exists())
            file.getParentFile().mkdirs();
        uploadedImageFile.getImage().transferTo(file);
        BufferedImage img = ImageUtil.change2jpg(file);
        ImageIO.write(img, "jpg", file);
        return "redirect:/admin";
    }

}
