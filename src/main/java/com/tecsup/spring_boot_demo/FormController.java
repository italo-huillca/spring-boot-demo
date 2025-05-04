package com.tecsup.spring_boot_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {

    @PostMapping("/submit-form")
    public String handleFormSubmission(@RequestParam("name") String name,
            @RequestParam("email") String email,
            Model model) {
        model.addAttribute("name", name);
        model.addAttribute("email", email);
        return "form-result";
    }
}