package com.example.raisetechjava202107.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class TopController {

    @RequestMapping("")
    public String index(Model model) {
        return "index";
    }
}
