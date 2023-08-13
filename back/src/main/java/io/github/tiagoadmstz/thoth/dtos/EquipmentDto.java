package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
public class EquipmentDto implements Serializable {

    private static final long serialVersionUID = -2253575532380193513L;
    private Long id;
    private String status;
    private String assetNumber;
    private String trackingBoard;
    private String serialNumber;
    private Double potency;
    private String potencyUnit;
    private LocalDateTime manufacturingDate;
    private String rotationsPerMinute;
    private String voltage;
    private String current;
    private String constructiveWay;
    private String connectionBox;
    private String coupling;
    private String cables;
    private String electricLock;
    private String brand;
    private String category;
    private String model;
    private List<CalculationDto> calculations;
}
