package io.github.tiagoadmstz.thoth.entities.enumerates;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ServiceOrderStatus {

    ESTIMATION("estimation"),
    EXECUTION("execution"),
    FINISHED("finished"),
    DELIVERED("delivered");

    private final String value;

}
