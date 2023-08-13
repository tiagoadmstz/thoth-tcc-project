package io.github.tiagoadmstz.thoth.interfaces;

import java.util.List;

public interface ThothCrudService<T> {

    List<T> listAll();

    T findById(Long id);

    T save(T objectDto);

    void delete(Long id);

}
