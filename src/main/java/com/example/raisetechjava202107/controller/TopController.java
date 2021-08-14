package com.example.raisetechjava202107.controller;

import java.util.List;

import com.example.raisetechjava202107.domain.Task;
import com.example.raisetechjava202107.service.TopService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class TopController {

    @Autowired
    TopService topService;

    @GetMapping
    public String index(Model model) {
        List<Task> taskList = topService.getAllTasks();

        model.addAttribute("taskList", taskList);

        return "index";
    }
}
