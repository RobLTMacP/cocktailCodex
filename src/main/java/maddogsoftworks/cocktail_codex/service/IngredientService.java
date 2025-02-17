package maddogsoftworks.cocktail_codex.service;

import maddogsoftworks.cocktail_codex.model.Ingredient;
import maddogsoftworks.cocktail_codex.repository.IngredientRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    // Create
    public Ingredient addNewIngredient(Ingredient newIngredient) {
        return ingredientRepository.save(newIngredient);
    }

    // Read
    public List<Ingredient> getAllIngredients() {
        return ingredientRepository.findAll();
    }

    public Optional<Ingredient> findIngredientById(Integer id) {
        return ingredientRepository.findById(id);
    }

    // Update
    public Ingredient update(Integer id, Ingredient updatedIngredient) {
        Optional<Ingredient> existingIngredient = ingredientRepository.findById(id);
        if (existingIngredient.isPresent()) {
            updatedIngredient.setId(id);
            return ingredientRepository.save(updatedIngredient);
        }
        return null;
    }
    // Delete
    public void deleteIngredientById(Integer id) {
        ingredientRepository.deleteById(id);
    }
}
