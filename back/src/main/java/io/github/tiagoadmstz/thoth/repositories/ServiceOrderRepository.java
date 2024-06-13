package io.github.tiagoadmstz.thoth.repositories;

import io.github.tiagoadmstz.thoth.entities.ServiceOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceOrderRepository extends JpaRepository<ServiceOrder, Long> {
}
