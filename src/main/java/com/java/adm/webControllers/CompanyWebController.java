package com.java.adm.webControllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/empresas")
public class CompanyWebController {

    @GetMapping("")
    public String empresas() {
        return "empresas";
    }

}