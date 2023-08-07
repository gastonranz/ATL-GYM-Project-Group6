package com.group6.gym.app.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "Membership")
public class Membership {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Long  id;
    @Column (name="name")
    private String name;
    @Column (name="last_name")
    private String lastName;
    @Column (name="email")
    private String email;
    @Column (name="phone_number")
    private String phoneNumber;
    @Column (name=" id_user")
    private int idUser;

}
