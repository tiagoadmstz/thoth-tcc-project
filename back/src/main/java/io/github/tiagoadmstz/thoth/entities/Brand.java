package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "brands")
public class Brand implements Serializable {

    private static final long serialVersionUID = -2010262119225481146L;
    @Id
    private Long id;
    private Boolean activated;
    @Column(length = 150)
    private String description;

}
