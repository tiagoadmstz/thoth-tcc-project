package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
public class SearchDto implements Serializable {

    private static final long serialVersionUID = 7247979288310420382L;
    private String serviceOrder;
    private String customerName;
    private String equipmentCategory;
    private LocalDate startPeriod;
    private LocalDate endPeriod;
    private String assetNumber;
    private String trackingBoard;
    private String serialNumber;
    private String potency;
    private String brandDescription;
    private String rotationsPerMinute;
    private String voltage;
    private String equipmentModel;
    private String width;
    private String diameter;
    private String slot;
    private String layer;
    private String step;
    private String spirals;
    private String auxiliaryStep;
    private String auxiliarySpirals;
    private String union;
}
