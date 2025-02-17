package maddogsoftworks.cocktail_codex.controller;

import maddogsoftworks.cocktail_codex.model.Cocktail;
import maddogsoftworks.cocktail_codex.service.CocktailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class CocktailController {

    private final CocktailService cocktailService;

    CocktailController(CocktailService cocktailService) {
        this.cocktailService = cocktailService;
    }

    @GetMapping("/cocktails")
    public List<Cocktail> getData() {
        return cocktailService.getAllCocktails();
    }
}
