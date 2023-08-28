package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "equipment")
public class Equipment {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="equipment_id")
    private Long  id;
    @Column (name="product_name")
    private String productName;
    @Column (name="description", length = 60)
    private String description;
    @Column (name="status")
    private Boolean status;
    @Column (name ="buy_time")
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime buyTime;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gym_id")
    private Gym gym;

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", buyTime=" + buyTime +
                '}';
    }
}
