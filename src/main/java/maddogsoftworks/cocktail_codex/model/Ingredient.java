package maddogsoftworks.cocktail_codex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Ingredients")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;



}
