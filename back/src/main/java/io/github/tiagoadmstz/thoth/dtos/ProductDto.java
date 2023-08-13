package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import lombok.Data;

@Data
public class ProductDto implements Serializable {

    private static final long serialVersionUID = 4941539728418754997L;
    private Long id;
    private Integer quantity;
    private String quantityUnit;
    private String code;
    private String description;
}
