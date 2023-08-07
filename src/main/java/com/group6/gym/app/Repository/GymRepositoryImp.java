package com.group6.gym.app.Repository;

import com.group6.gym.app.Entities.Gym;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GymRepositoryImp implements GymRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Gym> getAll() {
        return em.createQuery("Select m from Gym  m;",Gym.class).getResultList();
    }

    @Override
    public Gym findById(Long id) {
        return em.find(Gym.class,id);
    }

    @Override
    public void guardar(Gym gym) {
        em.persist(gym);

    }

    @Override
    public void actualizar(Gym gym) {
        em.merge(gym);
    }

    @Override
    public void eliminar(Long id) {
        em.remove(findById(id));
    }
}
