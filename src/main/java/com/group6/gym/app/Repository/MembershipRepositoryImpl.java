package com.group6.gym.app.Repository;

import com.group6.gym.app.entities.Membership;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MembershipRepositoryImpl implements MembershipRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Membership> getAll() {
        return em.createQuery("FROM Membership", Membership.class).getResultList();
    }

    @Override
    public Membership findById(Long id) {
        return em.find(Membership.class, id);
    }

    @Override
    public void guardar(Membership membership) {
        em.persist(membership);
    }

    @Override
    public void actualizar(Membership membership) {
        em.merge(membership);
    }

    @Override
    public void eliminar(Long id) {
        em.remove(findById(id));
    }
}
