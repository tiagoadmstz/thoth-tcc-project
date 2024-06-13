package io.github.tiagoadmstz.thoth.services;

import io.github.tiagoadmstz.thoth.dtos.ModelDto;
import io.github.tiagoadmstz.thoth.interfaces.ThothCrudService;
import io.github.tiagoadmstz.thoth.repositories.ModelRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ModelService implements ThothCrudService<ModelDto> {

    private final ModelRepository modelRepository;

    public ModelService(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public List<ModelDto> listAll() {
        return null;
    }

    @Override
    public ModelDto findById(Long id) {
        return null;
    }

    @Override
    public ModelDto save(ModelDto objectDto) {
        return null;
    }

    @Override
    public void delete(Long id) {
        //todo: to create the method implementation
    }
}
