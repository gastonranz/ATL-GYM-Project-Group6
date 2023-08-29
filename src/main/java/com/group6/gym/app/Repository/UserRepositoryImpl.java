package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepositoryImpl implements UserRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<User> getAll() {
        return em.createQuery("SELECT u FROM User u JOIN FETCH u.gym g JOIN FETCH u.membership", User.class)
                .getResultList();
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional
                .ofNullable(em.createQuery("SELECT u FROM User u JOIN FETCH u.gym g JOIN FETCH u.membership WHERE u.id = :id", User.class)
                .setParameter("id", id)
                .getSingleResult());
    }

    @Override
    public User guardar(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public User actualizar(User user) {
        em.merge(user);
        return user;
    }

    @Override
    public void eliminar(Long id) {
        em.remove(findById(id).orElseThrow(RuntimeException::new));
    }
}


