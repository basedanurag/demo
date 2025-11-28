package com.example.EcomWebsite.Ecomercewebsite.Controller;

import com.example.EcomWebsite.Ecomercewebsite.model.Category;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CategoryController {
    private  List<Category> categoryList = new ArrayList<>();

}
