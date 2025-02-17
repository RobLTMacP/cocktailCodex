package maddogsoftworks.cocktail_codex.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "Ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ingredient_name", nullable = false)
    private String ingredientName;

    @Column(name = "amount_on_hand", nullable = false)
    private BigDecimal amountOnHand;

    public Ingredient() {
    }

    public Ingredient(String ingredientName, BigDecimal amountOnHand) {
        this.ingredientName = ingredientName;
        this.amountOnHand = amountOnHand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public BigDecimal getAmountOnHand() {
        return amountOnHand;
    }

    public void setAmountOnHand(BigDecimal amountOnHand) {
        this.amountOnHand = amountOnHand;
    }
}
