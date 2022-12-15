package me.fevralev.bookofrecipes.services;

import me.fevralev.bookofrecipes.model.Recipe;

public interface RecipeService {


    Recipe add(Recipe recipe);
    Recipe getById(int id);
}
