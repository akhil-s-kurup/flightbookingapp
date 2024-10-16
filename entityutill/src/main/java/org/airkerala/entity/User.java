package org.airkerala.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "user_details")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String userName;
    private String password;
    @OneToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private Set<UserRole> userRoles;

    public User() {
    }

    public User(String userName, String password, Set<UserRole> role) {
        this.userName = userName;
        this.password = password;
        this.userRoles = role;
    }

}