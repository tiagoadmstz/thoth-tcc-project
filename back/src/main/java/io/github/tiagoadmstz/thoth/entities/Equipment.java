package io.github.tiagoadmstz.thoth.entities;

import io.github.tiagoadmstz.thoth.entities.enumerates.EquipamentStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "equipments")
public class Equipment implements Serializable {

    private static final long serialVersionUID = 1699763947978134240L;
    @Id
    private Long id;
    @OneToMany(targetEntity = ServiceOrder.class, mappedBy = "id")
    private List<Long> serviceOrderId;
    private EquipamentStatus status;
    private String assetNumber;
    private String trackingBoard;
    private String serialNumber;
    private Double potency;
    private String potencyUnit;
    private LocalDateTime manufacturingDate;
    private String rotationsPerMinute;
    private String voltage;
    private String current;
    private String constructiveWay;
    private String connectionBox;
    private String coupling;
    private String cables;
    private String electricLock;
    @ManyToOne
    private Brand brand;
    @ManyToOne
    private Category category;
    @ManyToOne
    private Model model;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Calculation> calculations;

}
