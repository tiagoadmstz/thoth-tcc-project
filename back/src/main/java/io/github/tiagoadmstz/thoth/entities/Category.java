package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "categories")
public class Category implements Serializable {

    private static final long serialVersionUID = -5556249213167766645L;
    @Id
    private Long id;
    private Boolean activated;
    private String description;
}
