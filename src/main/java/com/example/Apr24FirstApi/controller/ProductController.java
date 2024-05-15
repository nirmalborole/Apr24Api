package com.example.Apr24FirstApi.controller;

import com.example.Apr24FirstApi.dtos.CreateProductRequestDto;
import com.example.Apr24FirstApi.models.Product;
import com.example.Apr24FirstApi.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;
    @Autowired
    public ProductController(@Qualifier("selfproduct") ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") long id){
        return productService.getProductById(id);
    }
    public List<Product> getProducts(){
        return new ArrayList<Product>();
    }
    @PostMapping("")
    public Product createProduct(@RequestBody CreateProductRequestDto requestDto){
        return productService.createPeroduct(requestDto.getTitle(),requestDto.getDescription(),requestDto.getImage(),requestDto.getPrice(),requestDto.getCategoryName());

    }
}
