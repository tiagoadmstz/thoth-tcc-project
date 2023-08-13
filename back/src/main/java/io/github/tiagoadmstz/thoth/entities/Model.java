package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "models")
public class Model implements Serializable {

    private static final long serialVersionUID = 6422111638816540731L;
    @Id
    private Long id;
    private Boolean activated;
    private String description;
}
