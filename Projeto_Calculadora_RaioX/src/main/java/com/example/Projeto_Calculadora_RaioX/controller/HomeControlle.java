package com.example.Projeto_Calculadora_RaioX.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControlle {

    @GetMapping("/home")
    public String index(Model model) {
        UserController.isLoggedAsAdmin(model);
        try{
            return "home";
        }catch (Exception e) {
            model.addAttribute("message", e.getMessage());
            return "error";
        }
    }

    @GetMapping("/")
    public String redirectToHome() {
        return "redirect:/home";
    }
}