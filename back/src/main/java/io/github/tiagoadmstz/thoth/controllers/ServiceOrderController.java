package io.github.tiagoadmstz.thoth.controllers;

import io.github.tiagoadmstz.thoth.dtos.ServiceOrderDto;
import io.github.tiagoadmstz.thoth.models.Assets;
import io.github.tiagoadmstz.thoth.services.ServiceOrderService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/serviceorder")
public class ServiceOrderController {

    private final ServiceOrderService serviceOrderService;

    public ServiceOrderController(ServiceOrderService serviceOrderService) {
        this.serviceOrderService = serviceOrderService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Assets>> list() {
        return ResponseEntity.ok(serviceOrderService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceOrderDto> findById(@PathVariable Long id) {
        return ResponseEntity.ok(serviceOrderService.findById(id));
    }

    @PostMapping("/save")
    public ResponseEntity<ServiceOrderDto> save(@RequestBody ServiceOrderDto serviceOrderDto) {
        return ResponseEntity.ok(serviceOrderService.save(serviceOrderDto));
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id) {
        serviceOrderService.delete(id);
    }
}
