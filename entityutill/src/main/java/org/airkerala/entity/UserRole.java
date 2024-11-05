package org.airkerala.entity;

import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name = "user_role")
@Getter
@Setter
public class
UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int roleId;

    @ManyToOne
    private User users;

    private String role;

    public UserRole() {
    }

    public UserRole(User users, String role) {
        this.users = users;
        this.role = role;
    }

}
