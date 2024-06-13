package io.github.tiagoadmstz.thoth.services;

import io.github.tiagoadmstz.thoth.dtos.SearchDto;
import io.github.tiagoadmstz.thoth.models.SearchModel;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    public Optional<SearchDto> findEquipments(SearchModel searchModel) {
        return Optional.empty();
    }
}
