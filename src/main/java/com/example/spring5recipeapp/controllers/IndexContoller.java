package com.example.spring5recipeapp.controllers;

import com.example.spring5recipeapp.RecipeService;
import com.example.spring5recipeapp.domain.Category;
import com.example.spring5recipeapp.domain.Recipe;
import com.example.spring5recipeapp.domain.UnitOfMeasure;
import com.example.spring5recipeapp.repositories.CategoryRepository;
import com.example.spring5recipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;
import java.util.Set;

@Controller
public class IndexContoller {

    private RecipeService recipeService;

    public IndexContoller(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index"})
    public String getIndexPage(Model model) {
//        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
//        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");
//
//        System.out.println(categoryOptional.get().getDescription());
//        System.out.println(unitOfMeasureOptional.get().getDescription());

        Set<Recipe> recipes = recipeService.getAllRecipe();
        model.addAttribute("recipes", recipes);

        return "index";
    }
}
