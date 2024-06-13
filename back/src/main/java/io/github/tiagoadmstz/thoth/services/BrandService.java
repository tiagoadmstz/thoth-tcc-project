package io.github.tiagoadmstz.thoth.services;

import io.github.tiagoadmstz.thoth.dtos.BrandDto;
import io.github.tiagoadmstz.thoth.interfaces.ThothCrudService;
import io.github.tiagoadmstz.thoth.repositories.BrandRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class BrandService implements ThothCrudService<BrandDto> {

    private final BrandRepository brandRepository;

    public BrandService(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<BrandDto> listAll() {
        return null;
    }

    @Override
    public BrandDto findById(Long id) {
        return null;
    }

    @Override
    public BrandDto save(BrandDto objectDto) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
