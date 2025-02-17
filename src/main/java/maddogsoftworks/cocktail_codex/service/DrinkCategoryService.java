package maddogsoftworks.cocktail_codex.service;

import maddogsoftworks.cocktail_codex.model.DrinkCategory;
import maddogsoftworks.cocktail_codex.repository.DrinkCategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DrinkCategoryService {

    private final DrinkCategoryRepository drinkCategoryRepository;

    public DrinkCategoryService(DrinkCategoryRepository drinkCategoryRepository) {
        this.drinkCategoryRepository = drinkCategoryRepository;
    }

    // Create
    public DrinkCategory addDrinkCategory(DrinkCategory drinkCategory) {
        return drinkCategoryRepository.save(drinkCategory);
    }

    // Read
    public List<DrinkCategory> getAllDrinkCategories() {
        return drinkCategoryRepository.findAll();
    }

    public Optional<DrinkCategory> findDrinkCategoryById(Integer id) {
        return drinkCategoryRepository.findById(id);
    }

    // Update
    public DrinkCategory update(Integer id, DrinkCategory updatedDrinkCategory) {
        Optional<DrinkCategory> existingDrinkCategory = drinkCategoryRepository.findById(id);
        if (existingDrinkCategory.isPresent()) {
            updatedDrinkCategory.setId(id);
            return drinkCategoryRepository.save(updatedDrinkCategory);
        }
        return null;
    }

    // Delete
    public void deleteDrinkCategoryById(Integer id) {
        drinkCategoryRepository.deleteById(id);
    }

}
