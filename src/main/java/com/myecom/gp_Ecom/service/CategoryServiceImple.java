package com.myecom.gp_Ecom.service;

import com.myecom.gp_Ecom.model.Category;
import com.myecom.gp_Ecom.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImple implements CategoryService{
   // private List<Category> categories=new ArrayList<>();
   // private Long categoryId=1L;

    @Autowired
    CategoryRepository categoryRepo;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepo.findAll();
    }

    @Override
    public void createCategory(Category category) {
        categoryRepo.save(category);
    }

    @Override
    public String deleteCategory(Long categoryId) {
        Category category=categoryRepo.findById(categoryId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Category with CategoryId:- "+categoryId+" Not found"));
        categoryRepo.delete(category);
        return "Category with Id:- "+categoryId+" Deleted Successfully";
    }

    @Override
    public Category updateCategory(Category category, Long categoryId) {
        Category savedCategory=categoryRepo.findById(categoryId)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND,"Category with CategoryId:- "+categoryId+" Not found"));
        category.setCategoryId(categoryId);
        savedCategory=categoryRepo.save(category);
        return savedCategory;

    }

//    @Override
//    public Category getCategoryById(Long categoryId) {
//        return categoryRepo.findById(categoryId).orElse(new Category());
//    }


}
