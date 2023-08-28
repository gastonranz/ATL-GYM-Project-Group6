package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

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
    @Column(name = "name", length = 50, nullable = false)
    private String name;
    @Column(name = "last_name", length = 50, nullable = false)
    private String lastName;
    @Column(name = "phone_number", length = 20, nullable = false)
    private String phoneNumber;

    @Column(name = "born_date")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime bornDate;

    @Column(name = "email", length = 50, nullable = false, unique = true)
    private String email;
    @Column(name = "address", length = 50, nullable = false)
    private String address;
    @Column(name = "cp", length = 10, nullable = false)
    private int cp;
    @Column(name = "City", length = 50, nullable = false)
    private String City;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gym_id")
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

