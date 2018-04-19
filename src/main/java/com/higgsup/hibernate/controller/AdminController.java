package com.higgsup.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by anhvu on 19-Apr-18.
 */
@Controller
public class AdminController {
    @GetMapping("/admin")
    public String viewAdmin(Model model){
        model.addAttribute("title", "Spring Security Custom Login Form");
        model.addAttribute("message", "This is protected page!");
        return "admin";
    }
}
