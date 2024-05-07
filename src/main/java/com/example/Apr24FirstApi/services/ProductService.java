package com.example.Apr24FirstApi.services;

import com.example.Apr24FirstApi.models.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);
    public List<Product> getAllProducts();
}