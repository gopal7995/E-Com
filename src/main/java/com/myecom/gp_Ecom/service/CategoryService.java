package com.myecom.gp_Ecom.service;

import com.myecom.gp_Ecom.model.Category;

import java.util.List;

public interface CategoryService {
     List<Category> getAllCategories();
     void createCategory(Category category);
    String deleteCategory(Long categoryId);
    Category updateCategory(Category category, Long categoryId);
}
