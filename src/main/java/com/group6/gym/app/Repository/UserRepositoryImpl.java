package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAll() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User findByID(Long id) {
        return em.find(User.class, id);
    }

    @Override
    public void guardar(User user) {
        em.persist(user);
    }

    @Override
    public void actualizar(User user) {
        em.merge(user);
    }

    @Override
    public void eliminar(Long id) {
        em.remove(id);
    }
}


