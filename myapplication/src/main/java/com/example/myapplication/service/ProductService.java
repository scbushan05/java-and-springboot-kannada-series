package com.example.myapplication.service;

import com.example.myapplication.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductService {
    private static List<Product> productList;
    private static Map<String, String> countryMap;
    static {
        productList = new ArrayList<>();
        productList.add(new Product("iPhone 16", 100000.00, List.of("16MP Camera", "6GB RAM", "128GB Storage")));
        productList.add(new Product("Oneplus 14", 35000.00, List.of("8MP Camera", "4GB RAM", "64GB Storage")));

        countryMap = new HashMap<>();
        countryMap.put("australia", "Australia");
        countryMap.put("canada", "Canada");
        countryMap.put("india", "India");
        countryMap.put("south africa", "South Africa");
        countryMap.put("test", "Test");
    }

    public ProductService() {
        System.out.println("Inside product service");
    }

    public List<Product> getProducts() {
        return productList;
    }

    public Map<String, String> getCountries() {
        return countryMap;
    }
}
