package com.example.ecomwebsite.services;

import com.example.ecomwebsite.model.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategoryList();
    void addCategory(Category category);
}
