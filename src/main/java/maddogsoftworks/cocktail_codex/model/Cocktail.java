package maddogsoftworks.cocktail_codex.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Cocktails")
public class Cocktail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "instructions", columnDefinition = "LONGTEXT", nullable = false)
    private String instructions;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private DrinkCategory category;

}
