package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Drinks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrinksRepository extends JpaRepository<Drinks, Integer> {
    Drinks findByName(String name);
}
