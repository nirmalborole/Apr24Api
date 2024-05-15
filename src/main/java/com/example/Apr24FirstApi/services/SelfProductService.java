package com.example.Apr24FirstApi.services;

import com.example.Apr24FirstApi.Repository.CategoryRepository;
import com.example.Apr24FirstApi.Repository.ProductRepository;
import com.example.Apr24FirstApi.models.Category;
import com.example.Apr24FirstApi.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("selfproduct")
public class SelfProductService implements ProductService{
    ProductRepository productRepository;
    CategoryService categoryService;
    @Autowired
    public SelfProductService(ProductRepository productRepository,CategoryService categoryService) {
        this.productRepository = productRepository;
        this.categoryService =categoryService;
    }

    @Override
    public Product getProductById(long id) {
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public Product createPeroduct(String title, String description, String image, double price, String categoryName) {
        Category category=categoryService.createCategory(categoryName);
        Product product=new Product();
        product.setCategory(category);
        product.setImage(image);
        product.setDescription(description);
        product.setTitle(title);
        product.setPrice(price);
        return productRepository.save(product);
    }

    @Override
    public Product updatePrice(long productId, double updatePrice) {
        return null;
    }

    @Override
    public Product updateImage(long productId, double updateImage) {
        return null;
    }

    @Override
    public boolean deleteProduct() {
        return false;
    }
}
