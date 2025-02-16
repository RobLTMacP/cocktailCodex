package maddogsoftworks.cocktail_codex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "drink_ingredients")
public class DrinkIngredient {

    @EmbeddedId
    private DrinkIngredientId id;

    @ManyToOne
    @JoinColumn(name = "drink_id")
    private Drink drink;

    @ManyToOne
    @JoinColumn(name = "ingredient_id")
    private Ingredient ingredient;

    @Column(name = "amount", nullable = false)
    private String amount;

    public DrinkIngredient() {
    }

    public DrinkIngredient(Drink drink, Ingredient ingredient, String amount) {
        this.drink = drink;
        this.ingredient = ingredient;
        this.amount = amount;
    }

    public DrinkIngredientId getId() {
        return id;
    }

    public void setId(DrinkIngredientId id) {
        this.id = id;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

}
