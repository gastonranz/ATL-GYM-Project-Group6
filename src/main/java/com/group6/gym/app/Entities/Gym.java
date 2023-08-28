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
    @Column (name="gym_id")
    private Long  id;
    @Column(name="name", length = 40, nullable = false)
    private String name;
    @Column (name="phone_number", length = 20, nullable = false)
    private String phone_number;
    @Column (name="email", length = 50, nullable = false, unique = true)
    private String email;
    @Column (name="address", length = 50, nullable = false)
    private String address;
    @Column (name="cp", length = 8, nullable = false)
    private int cp;
    @Column (name="City", length = 25, nullable = false)
    private String City;
    @Column (name="Web", length = 50)
    private String Web;

    @OneToMany(cascade = {CascadeType.PERSIST}, mappedBy = "gym")
    private List<User> usuarios;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "gym")
    private List<Equipment> equipments;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE} , mappedBy = "gym")
    private List<Employee> employee;

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
