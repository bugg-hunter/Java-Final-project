package com.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;

import com.shop.model.UserModel;
import com.shop.repository.UserRepo;

@Controller
public class UserController {

    @Autowired
    private UserRepo userrepo_obj;

    @GetMapping("/")
    public String reg() {
        return "index";
    }

    @PostMapping("/createuser")
    public String saveUser(UserModel usernew, Model model) {
        System.out.println("************");
        System.out.println("usernew =" + usernew);
        System.out.println("************");
        userrepo_obj.save(usernew);

        return "welcome";

    }
    
}