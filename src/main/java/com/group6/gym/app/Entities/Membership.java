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

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "tipo_membership", length = 20, nullable = false)
    private String tipoMembership;

    @JsonIgnore
    @OneToOne(cascade =  CascadeType.ALL, orphanRemoval = true, mappedBy = "membership")
    private User usuario;

    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "membership")
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
