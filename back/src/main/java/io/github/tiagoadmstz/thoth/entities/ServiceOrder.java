package io.github.tiagoadmstz.thoth.entities;


import io.github.tiagoadmstz.thoth.entities.commons.ChangeControl;
import io.github.tiagoadmstz.thoth.entities.enumerates.ServiceOrderStatus;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "service_orders")
public class ServiceOrder implements Serializable {

    private static final long serialVersionUID = -648062139699869699L;
    @Id
    private Long id;
    @Enumerated(EnumType.STRING)
    private ServiceOrderStatus status;
    private String number;
    @Embedded
    private ChangeControl changeControl;
    private String customerName;
    @ManyToOne(cascade = CascadeType.DETACH)
    private Equipment equipment;
    @OneToOne(cascade = CascadeType.ALL)
    private EquipmentTest equipmentTest;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Product> products;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Service> services;
    @OneToOne(cascade = CascadeType.ALL)
    private Notes notes;
}
