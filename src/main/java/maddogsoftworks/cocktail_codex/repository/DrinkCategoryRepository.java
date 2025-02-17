package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.DrinkCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DrinkCategoryRepository extends JpaRepository<DrinkCategory, Integer> {
}
