package com.example.ecomwebsite.controller;

import com.example.ecomwebsite.model.Category;
import com.example.ecomwebsite.services.CategoryService;
import com.example.ecomwebsite.services.CategoryServiceimpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CategoryController {
    private CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/api/public/categories")
    public List<Category> getAllCategoryList() {
        return categoryService.getAllCategoryList();
    }
    @PostMapping("/api/public/categories")
    public String addCategory(@RequestBody Category category) {
        categoryService.addCategory(category);
        return "success";
    }
}
