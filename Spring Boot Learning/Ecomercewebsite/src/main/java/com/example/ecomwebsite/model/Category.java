package com.example.EcomWebsite.Ecomercewebsite.model;

public class Category {
    private  Long CategoryID;
    private  String CategoryName;

    public Long getCategoryID() {
        return CategoryID;
    }

    public Category(Long categoryID, String categoryName) {
        this.CategoryID = categoryID;
        this.CategoryName = categoryName;
    }

    public void setCategoryID(Long categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
