package com.group6.gym.app.Repository;

import com.group6.gym.app.Entities.Membership;

import java.util.List;

public interface MembershipRepository {
    List<Membership> getAll();
    Membership findById(Long id);
    void guardar (Membership membership);
    void actualizar(Membership membership);
    void eliminar (Long id);

}