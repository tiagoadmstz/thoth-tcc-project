package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import lombok.Data;

@Data
public class CategoryDto implements Serializable {

    private static final long serialVersionUID = -7485482929341309414L;
    private Long id;
    private String description;
}
