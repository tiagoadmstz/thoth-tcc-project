package io.github.tiagoadmstz.thoth.models;

import java.io.Serializable;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Assets implements Serializable {

    private static final long serialVersionUID = 831995431460363469L;
    private Long id;
    private String serviceOrderNumber;
    private String date;
    private String deadline;
    private String assetNumber;
    private String customerName;
    private String trackingBoard;
    private String categoryDescription;
    private String serialNumber;
    private String brandDescription;
    private String potency;
    private String rotationsPerMinute;
    private String voltage;
    private String equipmentModel;

}
