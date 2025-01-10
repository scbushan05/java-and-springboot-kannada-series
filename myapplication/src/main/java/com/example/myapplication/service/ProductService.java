package com.example.myapplication.service;

import com.example.myapplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private static List<Product> productList;
    static {
        productList = new ArrayList<>();
        productList.add(new Product("iPhone 16", 100000.00, List.of("16MP Camera", "6GB RAM", "128GB Storage")));
        productList.add(new Product("Oneplus 14", 35000.00, List.of("8MP Camera", "4GB RAM", "64GB Storage")));
    }

    public ProductService() {
        System.out.println("Inside product service");
    }

    public List<Product> getProducts() {
        return productList;
    }
}
