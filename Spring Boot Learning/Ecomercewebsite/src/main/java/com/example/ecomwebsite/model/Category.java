package com.example.ecomwebsite.model;

public class Category {
    private  Long CategoryID;
    private  String CategoryName;

    public Category(Long CategoryID, String CategoryName) {
        this.CategoryID = CategoryID;
        this.CategoryName = CategoryName;
    }

    public Long getCategoryID() {
        return CategoryID;
    }



    public void setCategoryID(Long CategoryID) {
        this.CategoryID = CategoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }
}
