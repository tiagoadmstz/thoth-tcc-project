package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import lombok.Data;

@Data
public class ModelDto implements Serializable {

    private static final long serialVersionUID = -7060047625035774169L;
    private Long id;
    private String description;
}
