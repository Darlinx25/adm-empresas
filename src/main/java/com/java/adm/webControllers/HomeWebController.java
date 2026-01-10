package com.java.adm.webControllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeWebController {

    @GetMapping("")
    public String home() {
        return "home";
    }
    
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    
    
}
