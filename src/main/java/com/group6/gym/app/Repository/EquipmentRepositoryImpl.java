package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Equipment;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class EquipmentRepositoryImpl implements EquipmentRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Equipment> getAll() {
        return em.createQuery("SELECT e FROM Equipment e JOIN FETCH e.gym", Equipment.class).getResultList();

    }

    public Optional<Equipment> findById(Long id) {
        return Optional.ofNullable(em.createQuery("SELECT e FROM Equipment e JOIN FETCH e.gym WHERE e.id = :id", Equipment.class)
                .setParameter("id", id)
                .getSingleResult());
    }

    public Equipment guardar(Equipment equipment) {
        em.persist(equipment);
        return equipment;
    }

    public Equipment actualizar(Equipment equipment) {
        em.merge(equipment);
        return equipment;
    }

    public void eliminar(Long id) {
        em.remove(findById(id).orElseThrow(RuntimeException::new));
    }
}