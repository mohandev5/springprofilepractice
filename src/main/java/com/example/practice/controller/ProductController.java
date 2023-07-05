package com.example.practice.controller;

import com.example.practice.entity.Product;
import com.example.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile({"prod"})
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping("/product/{quantity}")
    public Product findProduct(@PathVariable("quantity")int quantity){
        return service.getProductByQuantity(quantity);
    }
}
