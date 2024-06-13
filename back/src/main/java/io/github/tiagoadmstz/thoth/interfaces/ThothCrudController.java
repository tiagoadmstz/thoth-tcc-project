package io.github.tiagoadmstz.thoth.interfaces;

import java.util.List;
import org.springframework.http.ResponseEntity;

public interface ThothCrudController<T> {

    ResponseEntity<List<T>> list();

    ResponseEntity<T> findById(Long id);

    ResponseEntity<T> save(T modelDto);

    void delete(Long id);
}
