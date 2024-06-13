package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "service_order_products")
public class Product implements Serializable {

    private static final long serialVersionUID = 3700973813383529134L;
    @Id
    private Long id;
    @OneToOne(targetEntity = ServiceOrder.class, mappedBy = "id")
    @JoinColumn(name = "service_order", referencedColumnName = "id")
    private Long serviceOrderId;
    private Integer quantity;
    private String quantityUnit;
    private String code;
    private String description;

}
