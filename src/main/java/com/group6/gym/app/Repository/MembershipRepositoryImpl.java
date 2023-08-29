package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Membership;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MembershipRepositoryImpl implements MembershipRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Membership> getAll() {
        return em.createQuery("FROM Membership", Membership.class).getResultList();
    }

    @Override
    public Optional<Membership> findById(Long id) {
        return Optional.ofNullable(em.find(Membership.class, id));
    }

    @Override
    public Membership guardar(Membership membership) {
        em.persist(membership);
        return membership;
    }

    @Override
    public Membership actualizar(Membership membership) {
        em.merge(membership);
        return membership;
    }

    @Override
    public void eliminar(Long id) {
        em.remove(findById(id).orElseThrow(RuntimeException::new));
    }
}
