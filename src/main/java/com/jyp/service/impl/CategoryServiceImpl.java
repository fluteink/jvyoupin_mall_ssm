package com.jyp.service.impl;

import com.jyp.mapper.CategoryMapper;
import com.jyp.pojo.Category;
import com.jyp.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/9 15:03
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public void testadd(Category category) {
        categoryMapper.insert(category);
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryMapper.getAllCategories();
    }
}
