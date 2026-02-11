package com.example.ecomwebsite.controller;

import com.example.ecomwebsite.model.Category;
import com.example.ecomwebsite.services.CategoryService;
import com.example.ecomwebsite.services.CategoryServiceimpl;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CategoryController {
    private CategoryService categoryService;
    // constructor for controller
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
    @DeleteMapping ("/api/admin/categories/{categoryID}")
    public String deleteCategory(@PathVariable Long categoryID) {
        String status = categoryService.removeCategory(categoryID);
        return status;
    }
}
