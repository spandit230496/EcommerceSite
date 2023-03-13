package com.ecomsite.Ecommerce.Service;

import com.ecomsite.Ecommerce.Model.Category;
import com.ecomsite.Ecommerce.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryrepository;
    public List<CategoryRepository> getAllCategory(){
        return categoryrepository.findAll();
    }
//    public void addCategory(Category category){
//        categoryrepository.save(  category);
//
//    }

}
