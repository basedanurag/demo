package com.example.ecomwebsite.services;

import com.example.ecomwebsite.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CategoryServiceimpl implements CategoryService{
    private  List<Category> categoryList = new ArrayList<>();
    private Long nextId = 1L;
    @Override
    public List<Category> getAllCategoryList() {
        return categoryList;
    }

    @Override
    public void addCategory(Category category) {
        category.setCategoryID(nextId++);
        categoryList.add(category);
    }
}
