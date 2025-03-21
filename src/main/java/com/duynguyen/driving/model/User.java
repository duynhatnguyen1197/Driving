package com.duynguyen.driving.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="user")
@Data   // Generates getters, setters, toString, equals, and hashcode
@NoArgsConstructor  // Generates an empty constructor
@AllArgsConstructor // Generates a full constructor (all fields)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(unique = true)
    private String email;

    @Column(unique = true)
    private String phoneNumber;

    @Column(unique = true)
    private String password;
}