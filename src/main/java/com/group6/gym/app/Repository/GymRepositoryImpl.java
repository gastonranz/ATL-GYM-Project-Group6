package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Gym;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class GymRepositoryImpl implements GymRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Gym> getAll() {
        return em.createQuery("FROM Gym", Gym.class).getResultList();
    }

    @Override
    public Optional<Gym> findById(Long id) {
        return Optional.ofNullable(em.find(Gym.class, id)) ;
    }

    @Override
    public Gym guardar(Gym gym) {
        em.persist(gym);
        return gym;
    }

    @Override
    public Gym actualizar(Gym gym) {
        em.merge(gym);
        return gym;
    }

    @Override
    public void eliminar(Long id) {
        em.remove(findById(id).orElseThrow(RuntimeException::new));
    }
}
