package io.github.tiagoadmstz.thoth.services;

import io.github.tiagoadmstz.thoth.dtos.CategoryDto;
import io.github.tiagoadmstz.thoth.interfaces.ThothCrudService;
import io.github.tiagoadmstz.thoth.repositories.CategoryRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoryService implements ThothCrudService<CategoryDto> {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public List<CategoryDto> listAll() {
        return null;
    }

    @Override
    public CategoryDto findById(Long id) {
        return null;
    }

    @Override
    public CategoryDto save(CategoryDto objectDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
        //todo: to create the method implementation
    }
}
