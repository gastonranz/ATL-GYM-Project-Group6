package com.group6.gym.app.Service;

import com.group6.gym.app.Entities.Gym;
import com.group6.gym.app.Repository.GymRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@Transactional
   public class GymServiceImpl implements GymService{
    @Autowired
   private GymRepository gymService;

    @Override
    public List<Gym> getAll() {
        return gymService.getAll();
    }

    @Override
    public Gym findById(Long id) {
        return gymService.findById(id);
    }

    @Override
    public void guardar(Gym obj) {
        gymService.guardar(obj);

    }

    @Override
    public void actualizar(Gym obj) {
        gymService.actualizar(obj);

    }

    @Override
    public void eliminar(Long id) {
        gymService.eliminar(id);

    }
}
