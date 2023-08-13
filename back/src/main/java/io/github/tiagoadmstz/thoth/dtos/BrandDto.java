package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import lombok.Data;

@Data
public class BrandDto implements Serializable {

    private static final long serialVersionUID = -1988309061006600746L;
    private Long id;
    private String description;
}
