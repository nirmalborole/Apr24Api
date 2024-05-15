package com.example.Apr24FirstApi.services;

import com.example.Apr24FirstApi.models.Product;

import javax.swing.plaf.PanelUI;
import java.util.List;

public interface ProductService {
    public Product getProductById(long id);
    public List<Product> getAllProducts();
    public Product createPeroduct(String title,String description,String image,double price, String categoryName);
    public Product updatePrice(long productId, double updatePrice);
    public Product updateImage(long productId, double updateImage);

    public boolean deleteProduct();
}
