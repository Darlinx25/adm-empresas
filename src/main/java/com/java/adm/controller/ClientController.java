package com.java.adm.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientController {

    @GetMapping("")
    public String clientes() {
        return "clientes";
    }

}