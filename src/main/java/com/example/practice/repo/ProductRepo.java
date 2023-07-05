package com.example.practice.repo;

import com.example.practice.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {

    Product findByQuantity(int quantity);
}
