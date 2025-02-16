package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinkRepository extends JpaRepository<Drink, Integer> {
    Drink findByName(String name);
}
