package maddogsoftworks.cocktail_codex.repository;

import maddogsoftworks.cocktail_codex.model.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
}
