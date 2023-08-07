package com.group6.gym.app.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "born_date")
    private int bornDate;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "cp")
    private int cp;
    @Column(name = "City")
    private String City;
}

