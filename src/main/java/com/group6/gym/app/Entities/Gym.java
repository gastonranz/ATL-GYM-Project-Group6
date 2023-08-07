package com.group6.gym.app.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name= "Gym")
public class Gym {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Long  id;
    @Column(name="name")
    private String name;
    @Column (name="phone_number")
    private int phone_number;
    @Column (name="email")
    private String email;
    @Column (name="address")
    private String address;
    @Column (name="cp")
    private int cp;
    @Column (name="City")
    private String City;
    @Column (name="Web")
    private String Web;


}
