package io.github.tiagoadmstz.thoth.controllers;

import io.github.tiagoadmstz.thoth.dtos.CategoryDto;
import io.github.tiagoadmstz.thoth.interfaces.ThothCrudController;
import io.github.tiagoadmstz.thoth.services.CategoryService;
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

@RestController("/v1/category")
public class CategoryController implements ThothCrudController<CategoryDto> {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<CategoryDto>> list() {
        return ResponseEntity.ok(categoryService.listAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<CategoryDto> save(@RequestBody CategoryDto categoryDto) {
        return ResponseEntity.ok(categoryService.save(categoryDto));
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        categoryService.delete(id);
    }
}
