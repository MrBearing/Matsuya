package com.tasktoys.matsuya.web_controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    @RequestMapping("loginForm")
    String loginForm(Model model) {

        return "loginForm";
    }
}
