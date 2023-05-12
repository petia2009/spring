package org.example.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    private String login;
    private String password;
    private String mail;
    private String phoneNumber;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
