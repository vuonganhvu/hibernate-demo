package com.higgsup.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/error")
public class ErrorManageController {

    @GetMapping("/error_authorization")
    @PostMapping("/error_authorization")
    public String handlerErrorAuthenticate(Model model){
        return "error-authenticate";
    }
}
