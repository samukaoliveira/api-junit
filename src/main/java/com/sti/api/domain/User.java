package com.sti.api.domain;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    public User(String email, Integer id, String name, String password) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.password = password;
    }


}
