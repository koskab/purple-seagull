package shops.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import shops.entity.Shop;

public interface ShopsRepository<Shop, Long> extends JpaRepository<Shop, Long> {
}
