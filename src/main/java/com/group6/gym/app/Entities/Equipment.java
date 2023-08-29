package com.group6.gym.app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name= "equipments")
public class Equipment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column (name="equipment_id")
    private Long  id;
    @Column (name="product_name", nullable = false)
    private String productName;
    @Column (name="description", length = 60, nullable = false)
    private String description;
    @Column (name="status", nullable = false)
    private Boolean status;
    @Column (name ="buy_time", nullable = false)
    @DateTimeFormat(pattern = "dd/MM/yyyy HH:mm:ss")
    private LocalDateTime buyTime;

    @JsonIgnoreProperties({"usuarios", "equipments", "employees"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gym_id", nullable = false)
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
