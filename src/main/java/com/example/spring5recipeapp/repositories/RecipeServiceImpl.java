package com.example.spring5recipeapp.repositories;

import com.example.spring5recipeapp.RecipeService;
import com.example.spring5recipeapp.domain.Recipe;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getAllRecipe() {
        Set<Recipe> recipeSet = new HashSet<>();

        Iterable<Recipe> all = recipeRepository.findAll();
        if(all != null)
            all.iterator().forEachRemaining(recipeSet::add);

        return recipeSet;
    }
}
