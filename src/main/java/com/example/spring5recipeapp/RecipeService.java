package com.example.spring5recipeapp;

import com.example.spring5recipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getAllRecipe();
}
