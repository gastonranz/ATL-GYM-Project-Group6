package com.group6.gym.app.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "gyms")
public class Gym implements Serializable {
    private static final long serialVersionUID = 1L;

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
    private String cp;
    @Column (name="City", length = 25, nullable = false)
    private String City;
    @Column (name="Web", length = 50)
    private String Web;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE} , mappedBy = "gym")
    private List<User> usuarios;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE}, mappedBy = "gym")
    private List<Equipment> equipments;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE} , mappedBy = "gym")
    private List<Employee> employees;

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
