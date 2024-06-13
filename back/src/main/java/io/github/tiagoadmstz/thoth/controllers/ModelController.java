package io.github.tiagoadmstz.thoth.controllers;

import io.github.tiagoadmstz.thoth.dtos.ModelDto;
import io.github.tiagoadmstz.thoth.interfaces.ThothCrudController;
import io.github.tiagoadmstz.thoth.services.ModelService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController("/model")
public class ModelController implements ThothCrudController<ModelDto> {

    private final ModelService modelService;

    public ModelController(ModelService modelService) {
        this.modelService = modelService;
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<ModelDto>> list() {
        return ResponseEntity.ok(modelService.listAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<ModelDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(modelService.findById(id));
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<ModelDto> save(@RequestBody ModelDto modelDto) {
        return ResponseEntity.ok(modelService.save(modelDto));
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        modelService.delete(id);
    }
}
