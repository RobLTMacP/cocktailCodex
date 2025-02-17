package maddogsoftworks.cocktail_codex.service;

import maddogsoftworks.cocktail_codex.model.Cocktail;
import maddogsoftworks.cocktail_codex.repository.CocktailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CocktailService {

    private final CocktailRepository cocktailRepository;

    @Autowired
    public CocktailService(CocktailRepository cocktailRepository) {
        this.cocktailRepository = cocktailRepository;
    }

    // CREATE
    public Cocktail addCocktail(Cocktail cocktail) {
        return cocktailRepository.save(cocktail);
    }

     // READ
    public List<Cocktail> getAllCocktails() {
        return cocktailRepository.findAll();
    }

    public Optional<Cocktail> getById(Long id) {
        return cocktailRepository.findById(id);
    }

    // UPDATE
    public Cocktail update(Long id, Cocktail updatedCocktail) {
        Optional<Cocktail> existingCocktail = cocktailRepository.findById(id);
        if (existingCocktail.isPresent()) {
            updatedCocktail.setId(id);
            return cocktailRepository.save(updatedCocktail);
        }
        return null;
    }

    // DELETE
    public void delete(Long id) {
        cocktailRepository.deleteById(id);
    }

}
