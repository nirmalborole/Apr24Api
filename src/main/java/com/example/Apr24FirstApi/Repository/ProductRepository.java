package com.example.Apr24FirstApi.Repository;

import com.example.Apr24FirstApi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long>{
}
