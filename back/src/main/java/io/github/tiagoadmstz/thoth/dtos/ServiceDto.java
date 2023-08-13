package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import lombok.Data;

@Data
public class ServiceDto implements Serializable {

    private static final long serialVersionUID = 8058364152668430854L;
    private Long id;
    private Integer quantity;
    private String quantityUnit;
    private String description;
}
