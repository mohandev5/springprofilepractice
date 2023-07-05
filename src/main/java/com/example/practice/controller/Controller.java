package com.example.practice.controller;

import com.example.practice.entity.Product;
import com.example.practice.repo.ProductRepo;
import com.example.practice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Profile({"test","dev"})
public class Controller {

    @Autowired
   private ProductService service;
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    @GetMapping("/list")
    public List<Product> all(){
        return service.allProducts();
    }
}
