package io.github.tiagoadmstz.thoth.repositories;

import io.github.tiagoadmstz.thoth.entities.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
}
