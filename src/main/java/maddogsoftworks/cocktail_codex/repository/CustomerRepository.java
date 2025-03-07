package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
