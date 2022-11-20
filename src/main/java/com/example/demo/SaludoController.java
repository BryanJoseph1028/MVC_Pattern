package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludoController {
    @GetMapping("/saludo")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="Analisis de sistemas") String name, Model model) {
        model.addAttribute("name", name);
        return "saludo";
    }
}
