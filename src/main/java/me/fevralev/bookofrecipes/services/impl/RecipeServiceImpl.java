package me.fevralev.bookofrecipes.services.impl;

import me.fevralev.bookofrecipes.model.Recipe;
import me.fevralev.bookofrecipes.services.RecipesService;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RecipesServiceImpl implements RecipesService {
    private int id=0;
    public Map<Integer, Recipe> recipeBook;


    @Override
    public void add(Recipe recipe) {
      recipeBook.put(id++, recipe);
    }


    @Override
    public Recipe getById(int id) {
        return recipeBook.get(id);
    }
}
