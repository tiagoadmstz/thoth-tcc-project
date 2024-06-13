package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import lombok.Data;

@Data
public class CalculationDto implements Serializable {

    private static final long serialVersionUID = -2848992837774231054L;
    private Long id;
    private String width;
    private String diameter;
    private String slot;
    private String layer;
    private Boolean originalWinding;
    private String union;
    private Double weight;
    private String step;
    private String spirals;
    private String wire;
    private String section;
    private String auxiliaryStep;
    private String auxiliarySpirals;
    private String auxiliaryWire;
    private String auxiliarySection;
    private String additionalInformation;
}
