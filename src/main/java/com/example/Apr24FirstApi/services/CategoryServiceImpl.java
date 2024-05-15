package com.example.Apr24FirstApi.services;

import com.example.Apr24FirstApi.Repository.CategoryRepository;
import com.example.Apr24FirstApi.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService{
    private CategoryRepository categoryRepository;
    @Autowired
    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category createCategory(String name) {
        Category category=new Category();
        category.setName(name);

        return categoryRepository.save(category);
    }
}
