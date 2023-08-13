package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "notes")
public class Notes implements Serializable {

    private static final long serialVersionUID = 7997876213730337248L;
    @Id
    private Long id;
    @OneToOne(targetEntity = ServiceOrder.class, mappedBy = "id")
    private Long serviceOrderId;
    private String burningCause;
    private String palletNumber;
    private String moldNumber;
    private String chockNumber;
    private String note;
    private String invoice;
    private LocalDate deadline;
    private LocalDate rewindDeadline;
    private LocalDate assemblyDeadline;

}
