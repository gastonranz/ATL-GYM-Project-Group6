package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.group6.gym.app.entities.User;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "membership")
public class Membership {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name = "membership_id")
    private Long id;

    private String nombre;

    private String tipoMembership;

    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL, orphanRemoval = true, mappedBy = "membership")
    private User usuario;

    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL, orphanRemoval = true, mappedBy = "membership")
    private Gym gym;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;

    @Override
    public String toString() {
        return "Membership{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", tipoMembership=" + tipoMembership +
                '}';
    }
}
