package com.example.Apr24FirstApi.services;

import com.example.Apr24FirstApi.dtos.FakeProductServiceDto;
import com.example.Apr24FirstApi.models.Category;
import com.example.Apr24FirstApi.models.Product;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class FakeStoreProductServiceImpl implements ProductService{

    private Product convertDtoToProduct(FakeProductServiceDto dto){
        Product product=new Product();

        Category category=new Category();
        return product;

    }
    @Override
    public Product getProductById(long id) {
        RestTemplate restTemplate= new RestTemplate();
        FakeProductServiceDto product = restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServiceDto.class);

        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }
}
