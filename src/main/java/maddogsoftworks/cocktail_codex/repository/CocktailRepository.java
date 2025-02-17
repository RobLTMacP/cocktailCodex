package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CocktailRepository extends JpaRepository<Cocktail, Integer> {
    Cocktail findByName(String name);
}
