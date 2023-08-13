package io.github.tiagoadmstz.thoth.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User implements Serializable {

    private static final long serialVersionUID = -226867474002347379L;
    @Id
    private Long id;
    private Boolean enable = true;
    @Column(name = "username", length = 15)
    private String username;
    private String password;

}
