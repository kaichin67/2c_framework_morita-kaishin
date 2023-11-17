package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gitLoginController {

    @RequestMapping("/gitpralogin")
    public String login() {
        return "gitlogon";
    }

    @PostMapping("/loginProcess")
    public String loginProcess(@RequestParam String username, @RequestParam String password, Model model) {
        if ("gitlogin".equals(username) && "gitpw".equals(password)) {
            return "redirect:/productList";
        } else {
            model.addAttribute("error", "Invalid credentials. Please try again.");
            return "login";
        }
    }

    @RequestMapping("/productList")
    public String productList() {
        return "productList";
    }
}
