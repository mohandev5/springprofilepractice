package com.example.practice.service;

import com.example.practice.entity.Product;
import com.example.practice.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> allProducts(){
        return repo.findAll();
    }

    public Product getProductByQuantity(int quantity){
        Product product= repo.findByQuantity(quantity);
        if(product!=null){
            return product;
        }else{
          throw new IllegalArgumentException("Invalid quantity :"+ quantity);
        }
    }
}
