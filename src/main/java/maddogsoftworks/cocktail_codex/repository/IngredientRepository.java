package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Ingredients;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredients, Integer> {
    Ingredients findByName(String name);
}
