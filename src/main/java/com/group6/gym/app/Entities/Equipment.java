package com.group6.gym.app.Entities;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name= "Equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="id")
    private Long  id;
    @Column (name="product_name")
    private String productName;
    @Column (name="description")
    private String description;
    @Column (name="status")
    private Boolean status;
    @Column (name="buy_time")
    private Timestamp buyTime;
    @Column (name="GymId")
    private int  GymId;


}
