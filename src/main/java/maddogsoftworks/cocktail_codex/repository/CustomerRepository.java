package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
