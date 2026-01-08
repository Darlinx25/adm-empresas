package com.java.adm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(/*@RequestParam String usuario, Model model*/) {
        //model.addAttribute("mensaje", "Hola " + usuario);
        return "/home.html"; // Spring busca automáticamente el HTML
    }
}