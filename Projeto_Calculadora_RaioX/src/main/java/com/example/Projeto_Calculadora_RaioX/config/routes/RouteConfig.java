package com.example.Projeto_Calculadora_RaioX.config.routes;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RouteConfig implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/register").setViewName("register");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/error").setViewName("error");
        registry.addViewController("/form").setViewName("form");
        registry.addViewController("/logCalculo").setViewName("logCalculo");
        registry.addViewController("/resultados").setViewName("resultados");
        registry.addViewController("/user-list").setViewName("user-list");
    }
}
