/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.adm.logic.controllers;

import com.java.adm.logic.classes.AppUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author faxcundo
 */
@Controller
public class HomeController {
    private final UserRepository userRepository;
    
    public HomeController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    @GetMapping("/saveUser")
    public String saveUser() {
        AppUser u = new AppUser();
        u.setName("Facundo");
        
        userRepository.save(u); // Opens transaction, saves, commits, closes. Automatic.
        
        return "index";
    }
    
}
