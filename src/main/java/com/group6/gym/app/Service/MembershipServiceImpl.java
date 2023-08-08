package com.group6.gym.app.Service;

import com.group6.gym.app.entities.Membership;
import com.group6.gym.app.Repository.MembershipRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MembershipServiceImpl implements MembershipService {
    @Autowired
    private MembershipRepository membershipRepository;

    @Override
    public List<Membership> getAll() {
        return membershipRepository.getAll();
    }

    @Override
    public Membership findById(Long id) {
        return membershipRepository.findById(id);
    }

    @Override
    public void guardar(Membership membership) {
        membershipRepository.guardar(membership);
    }

    @Override
    public void actualizar(Membership membership) {
        membershipRepository.actualizar(membership);

    }

    @Override
    public void eliminar(Long id) {
        membershipRepository.eliminar(id);
    }
}
