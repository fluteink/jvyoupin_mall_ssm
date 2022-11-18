package com.jyp.service;

import com.jyp.pojo.Category;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/9 15:02
 */

public interface CategoryService {
    void testadd(Category category);

    List<Category> getAllCategories();

    void deleteCategory(Integer id);

    void add(Category c);

    Category getCategoryByCategoryId(Integer id);

    void update(Category c);
}
