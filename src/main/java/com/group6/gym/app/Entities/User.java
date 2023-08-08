package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "phone_number")
    private int phoneNumber;
    @Column(name = "born_date")
    private LocalDateTime bornDate;
    @Column(name = "email")
    private String email;
    @Column(name = "address")
    private String address;
    @Column(name = "cp")
    private int cp;
    @Column(name = "City")
    private String City;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gym")
    private Gym gym;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "membership_id")
    private Membership membership;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", bornDate=" + bornDate +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", cp=" + cp +
                ", City='" + City + '\'' +
                '}';
    }
}

