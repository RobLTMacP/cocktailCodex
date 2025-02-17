package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Cocktail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CocktailRepository extends JpaRepository<Cocktail, Long> {
}
