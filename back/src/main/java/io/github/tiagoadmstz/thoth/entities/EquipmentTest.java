package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalTime;
import lombok.Data;

@Data
@Entity
@Table(name = "equipment_tests")
public class EquipmentTest implements Serializable {

    private static final long serialVersionUID = -4270321264855607478L;
    @Id
    private Long id;
    @OneToOne(targetEntity = ServiceOrder.class, mappedBy = "id")
    @JoinColumn(name = "service_order", referencedColumnName = "id")
    private Long serviceOrderId;
    private String voltage;
    private String rst;
    private String rstResult;
    private String windingResistance;
    private String resistanceResult;
    private String isolation;
    private String frontVibration;
    private String rearVibration;
    private String rotationPerMinute;
    private LocalTime impregnationTime;
    private Boolean bellTest;

}
