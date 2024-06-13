package io.github.tiagoadmstz.thoth.services;

import io.github.tiagoadmstz.thoth.dtos.ServiceOrderDto;
import io.github.tiagoadmstz.thoth.models.Assets;
import io.github.tiagoadmstz.thoth.repositories.ServiceOrderRepository;
import java.util.Collections;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ServiceOrderService {

    private final ServiceOrderRepository serviceOrderRepository;

    public ServiceOrderService(ServiceOrderRepository serviceOrderRepository) {
        this.serviceOrderRepository = serviceOrderRepository;
    }

    public List<Assets> listAll() {
        //return serviceOrderRepository.findAll();
        return Collections.emptyList();
    }

    public ServiceOrderDto findById(Long id) {
        //return serviceOrderRepository.findById(id).orElseGet(ServiceOrder::new);
        return new ServiceOrderDto();
    }

    public ServiceOrderDto save(ServiceOrderDto serviceOrderDto) {
        return new ServiceOrderDto();
    }

    public void delete(Long id) {
        //todo: to create the method body
    }
}
