package users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import users.entity.User;

public interface UsersRepository<User, Long> extends JpaRepository<User, Long> {
}
