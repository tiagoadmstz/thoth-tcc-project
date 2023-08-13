package io.github.tiagoadmstz.thoth.controllers;

import io.github.tiagoadmstz.thoth.dtos.SearchDto;
import io.github.tiagoadmstz.thoth.models.SearchModel;
import io.github.tiagoadmstz.thoth.services.SearchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/search")
public class SearchController {

    private final SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @PostMapping("/equipment")
    public ResponseEntity<SearchDto> search(@RequestBody SearchModel searchModel) {
        return ResponseEntity.of(searchService.findEquipments(searchModel));
    }
}
