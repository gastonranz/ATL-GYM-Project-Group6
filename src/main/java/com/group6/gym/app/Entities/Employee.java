package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private Long id;
    @Column(name="name")
    private String name;
    @Column(name="last_name")
    private String lastName;
    @Column (name="email")
    private String email;
    @Column (name = "phone_number", length = 20)
    private String phoneNumber;
    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL, orphanRemoval = true, mappedBy = "employee")
    private Gym gym;
    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL, orphanRemoval = true, mappedBy = "employee")
    private Membership membership;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
