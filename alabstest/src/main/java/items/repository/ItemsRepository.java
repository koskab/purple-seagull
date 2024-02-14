package items.repository;

import items.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemsRepository<Item, Long> extends JpaRepository<Item, Long> {
}
