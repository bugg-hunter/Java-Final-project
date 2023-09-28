package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.shop.model.ProductModel;
import com.shop.repository.ProductRepo;

@Controller
public class ProductController {
    @Autowired
    private ProductRepo productrepo_obj;

    @GetMapping("/product")
    public String pro(){
        return "product";
    }
    
    @PostMapping("/createProduct")
    public String saveProduct(ProductModel newproduct,Model model){

    	System.out.println("************");
    	System.out.println("usernew ="+newproduct);
    	System.out.println("************");
       productrepo_obj.save(newproduct);
      return "welcome";
      
    }




    
}



    // @GetMapping("/")
    // public String reg(){
    //     return "index";
    // }

    // @PostMapping("/createuser")
    // public String saveUser(UserModel usernew,Model model){
    // 	System.out.println("************");
    // 	System.out.println("usernew ="+usernew);
    // 	System.out.println("************");
    //    userrepo_obj.save(usernew);
    
    //   return "welcome";
      
    // }

