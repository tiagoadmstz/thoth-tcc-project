package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import java.time.LocalTime;
import lombok.Data;

@Data
public class EquipmentTestDto implements Serializable {

    private static final long serialVersionUID = 4999674576088213757L;
    private Long id;
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
