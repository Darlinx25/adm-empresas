package com.java.adm.webControllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes")
public class ClientWebController {

    @GetMapping("")
    public String clientes() {
        return "clientes";
    }
    
    @GetMapping("/crear-cliente")
    public String crearClientes() {
        return "crearCliente";
    }
    

}