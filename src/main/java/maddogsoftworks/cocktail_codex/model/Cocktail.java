package maddogsoftworks.cocktail_codex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cocktails")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "instructions", columnDefinition = "LONGTEXT", nullable = false)
    private String instructions;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private DrinkCategory category;

    public Cocktail() {
    }

    public Cocktail(String name, String instructions, DrinkCategory category) {
        this.name = name;
        this.instructions = instructions;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public DrinkCategory getCategory() {
        return category;
    }

    public void setCategory(DrinkCategory category) {
        this.category = category;
    }
}
