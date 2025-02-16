package maddogsoftworks.cocktail_codex.model;

import java.io.Serializable;
import java.util.Objects;

public class DrinkIngredientId implements Serializable {
    private Integer drinkId;
    private Integer ingredientId;

    public DrinkIngredientId() {}

    public DrinkIngredientId(Integer drinkId, Integer ingredientId) {
        this.drinkId = drinkId;
        this.ingredientId = ingredientId;
    }

    public Integer getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Integer drinkId) {
        this.drinkId = drinkId;
    }

    public Integer getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(Integer ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrinkIngredientId that = (DrinkIngredientId) o;
        return Objects.equals(drinkId, that.drinkId) && Objects.equals(ingredientId, that.ingredientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drinkId, ingredientId);
    }


}
