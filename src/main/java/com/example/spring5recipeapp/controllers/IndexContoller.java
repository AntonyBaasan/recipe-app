package com.example.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexContoller {

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        return "index";
    }
}
