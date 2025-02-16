package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.DrinkIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkIngredientRepository extends JpaRepository<DrinkIngredient, Integer> {
}
