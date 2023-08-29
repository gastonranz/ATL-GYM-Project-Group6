package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Membership;

import java.util.List;
import java.util.Optional;

public interface MembershipService {
    List<Membership> getAll();

    Optional<Membership> findById(Long id);

    Membership guardar(Membership membership);

    Membership actualizar(Membership membership);

    void eliminar(Long id);
}
