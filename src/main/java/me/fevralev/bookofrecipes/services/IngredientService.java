package me.fevralev.bookofrecipes.services;

import me.fevralev.bookofrecipes.model.Ingredient;

public interface IngredientService {
    Ingredient add(Ingredient ingr);
    Ingredient getById(int id);

}
