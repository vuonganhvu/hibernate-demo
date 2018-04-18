package com.higgsup.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by anhvu on 18-Apr-18.
 */
@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model){
        return "login";
    }
}
