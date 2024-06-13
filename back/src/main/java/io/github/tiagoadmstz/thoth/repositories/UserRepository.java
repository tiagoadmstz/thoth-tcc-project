package io.github.tiagoadmstz.thoth.repositories;

import io.github.tiagoadmstz.thoth.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
