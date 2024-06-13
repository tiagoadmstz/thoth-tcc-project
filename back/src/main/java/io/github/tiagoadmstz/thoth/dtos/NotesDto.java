package io.github.tiagoadmstz.thoth.dtos;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.Data;

@Data
public class NotesDto implements Serializable {

    private static final long serialVersionUID = -810370609822017209L;
    private Long id;
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
