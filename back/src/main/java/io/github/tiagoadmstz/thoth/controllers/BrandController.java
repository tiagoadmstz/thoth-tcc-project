package io.github.tiagoadmstz.thoth.controllers;

import io.github.tiagoadmstz.thoth.dtos.BrandDto;
import io.github.tiagoadmstz.thoth.interfaces.ThothCrudController;
import io.github.tiagoadmstz.thoth.services.BrandService;
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

@RestController("/brand")
public class BrandController implements ThothCrudController<BrandDto> {

    private final BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @Override
    @GetMapping("/list")
    public ResponseEntity<List<BrandDto>> list() {
        return ResponseEntity.ok(brandService.listAll());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<BrandDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(brandService.findById(id));
    }

    @Override
    @PostMapping("/save")
    public ResponseEntity<BrandDto> save(@RequestBody BrandDto brandDto) {
        return ResponseEntity.ok(brandService.save(brandDto));
    }

    @Override
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        brandService.delete(id);
    }
}
