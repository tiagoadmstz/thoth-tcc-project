package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "calculations")
public class Calculation implements Serializable {

    private static final long serialVersionUID = -3400235606266944223L;
    @Id
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
