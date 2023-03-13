package com.ecomsite.Ecommerce.Controller;

import com.ecomsite.Ecommerce.Model.Category;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom")
public class AdminController {
    @GetMapping("/admin")
    public String adminHome(){
        return "adminHome";
    }
    @GetMapping("/admin/categories")
    public String categories(){
        return "categories";
    }
    @GetMapping("/admin/categories/add")
    public String categoriesAdd(Model model){
        model.addAllAttribute("category",new Category());
        return "categoriesAdd";
    }
}
