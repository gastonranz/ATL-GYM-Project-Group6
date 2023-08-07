package com.group6.gym.app.Repository;

import com.group6.gym.app.Entities.Equipment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class EquipmentRepositoryImp implements EquipmentRepository {


    @PersistenceContext
    private EntityManager em;

    public List<Equipment> getAll() {
        return em.createQuery("select m from Equipment m ;", Equipment.class).getResultList();

    }

    public Equipment findById(Long id) {
        return em.find(Equipment.class, id);
    }

    public void guardar(Equipment equipment) {
        em.persist(equipment);

    }

    public void actualizar(Equipment equipment) {
        em.merge(equipment);
    }

    public void eliminar(Long id) {
        em.remove(findById(id));

    }
}