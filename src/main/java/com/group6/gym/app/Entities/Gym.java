package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "gym")
public class Gym {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id_gym")
    private Long  id;
    @Column(name="name")
    private String name;
    @Column (name="phone_number")
    private String phone_number;
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

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "gym")
    private List<User> usuarios;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true,mappedBy = "gym")
    private List<Equipment> equipments;

    @OneToOne
    @JoinColumn(name = "membership_id")
    private Membership membership;


    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone_number=" + phone_number +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", cp=" + cp +
                ", City='" + City + '\'' +
                ", Web='" + Web + '\'' +
                '}';
    }
}
