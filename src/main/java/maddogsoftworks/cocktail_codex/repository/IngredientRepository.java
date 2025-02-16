package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
    Ingredient findByName(String name);
}
