package com.group6.gym.app.Controllers;

import com.group6.gym.app.Entities.Membership;
import com.group6.gym.app.Service.MembershipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/membership")

public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    @GetMapping
    public List<Membership> getMemberships(){
        return membershipService.getAll();

    }
    @GetMapping("/{id}")
    public Membership getMembership(@PathVariable("id") Long id){
        return membershipService.findById(id);
    }
    @PostMapping
    public void saveMembership(@RequestBody Membership membership ){
        membershipService.guardar(membership);
    }
    @PutMapping ("/{id}")
    public void actualizarMembership(@PathVariable("id") Long id,@RequestBody Membership membership){
        membershipService.actualizar(membership);
    }
    @DeleteMapping("/{id}")
    public void eliminarMembership(@PathVariable("id") Long id){
        membershipService.eliminar(id);
    }

}
