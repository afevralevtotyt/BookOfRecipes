package me.fevralev.bookofrecipes.services;

import me.fevralev.bookofrecipes.model.Recipe;

public interface RecipesService {


    void add(Recipe recipe);
    Recipe getById(int id);
}
