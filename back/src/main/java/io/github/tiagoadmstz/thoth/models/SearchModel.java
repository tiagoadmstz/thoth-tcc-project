package io.github.tiagoadmstz.thoth.models;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SearchModel implements Serializable {

    private static final long serialVersionUID = -4565555220498734580L;

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
