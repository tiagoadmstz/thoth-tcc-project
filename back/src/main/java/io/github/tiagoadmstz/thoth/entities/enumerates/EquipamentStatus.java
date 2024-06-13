package io.github.tiagoadmstz.thoth.entities.enumerates;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum EquipamentStatus {

    PREVENTIVE_MAINTENANCE("preventive maintenance"),
    CORRECTIVE_MAINTENANCE("corrective maintenance"),
    SCRAPPED("scrapped");

    private final String value;

}
