package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class ServiceOrderDto implements Serializable {

    private static final long serialVersionUID = 7437486091565671621L;
    private Long id;
    private String status;
    private String number;
    private LocalDateTime creation;
    private String creationUser;
    private LocalDateTime updated;
    private String updateUser;
    private String customerName;
    private EquipmentDto equipment;
    private EquipmentTestDto equipmentTest;
    private List<ProductDto> products;
    private List<ServiceDto> services;
    private NotesDto notes;
}
