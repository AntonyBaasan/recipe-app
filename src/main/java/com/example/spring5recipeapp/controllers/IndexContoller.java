package com.example.spring5recipeapp.controllers;

import com.example.spring5recipeapp.domain.Category;
import com.example.spring5recipeapp.domain.UnitOfMeasure;
import com.example.spring5recipeapp.repositories.CategoryRepository;
import com.example.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexContoller {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexContoller(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println(categoryOptional.get().getDescription());
        System.out.println(unitOfMeasureOptional.get().getDescription());

        return "index";
    }
}
