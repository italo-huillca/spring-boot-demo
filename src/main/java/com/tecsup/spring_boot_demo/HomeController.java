package com.tecsup.spring_boot_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("mensaje", "¡Bienvenido a mi aplicación Spring Boot!");
        return "index"; // Nombre de la vista (index.html)
    }

    @GetMapping("/form")
    public String formulario(Model model) {
        return "form";
    }
}
