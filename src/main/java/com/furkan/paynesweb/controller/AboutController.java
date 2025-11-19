package com.furkan.paynesweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

    @GetMapping("/hakkimizda")
    public String about(Model model) {
        model.addAttribute("activePage", "about");
        return "about";
    }

}
