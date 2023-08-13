package io.github.tiagoadmstz.thoth.entities.commons;

import io.github.tiagoadmstz.thoth.entities.User;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Data;

@Data
@Embeddable
public class ChangeControl implements Serializable {

    private LocalDateTime creation = LocalDateTime.now();
    @ManyToOne(cascade = CascadeType.DETACH)
    private User creationUser;
    private LocalDateTime updated = LocalDateTime.now();
    @ManyToOne(cascade = CascadeType.DETACH)
    private User updateUser;

}
