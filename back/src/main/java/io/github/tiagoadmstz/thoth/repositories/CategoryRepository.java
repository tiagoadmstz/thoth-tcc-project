package io.github.tiagoadmstz.thoth.repositories;

import io.github.tiagoadmstz.thoth.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
