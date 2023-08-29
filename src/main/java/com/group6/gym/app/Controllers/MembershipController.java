package com.group6.gym.app.Controllers;

import com.group6.gym.app.entities.Membership;
import com.group6.gym.app.Service.MembershipService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/membership")
public class MembershipController {
    @Autowired
    private MembershipService membershipService;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping
    public ResponseEntity<List<Membership>> getMemberships() {
        try {
            List<Membership> memberships = membershipService.getAll();

            if (memberships.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            } else {
                return new ResponseEntity<>(memberships, HttpStatus.OK);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Membership> getMembership(@PathVariable("id") Long id) {
        try {
            Optional<Membership> membership = membershipService.findById(id);

            return membership.map(value -> new ResponseEntity<>(value, HttpStatus.CREATED))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Membership> saveMembership(@RequestBody Membership membership) {
        try {
            Membership membershipSaved = membershipService.guardar(membership);

            if (membershipSaved != null) {
                return new ResponseEntity<>(membershipSaved, HttpStatus.CREATED);
            } else {
                return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Membership> actualizarMembership(@PathVariable("id") Long id, @RequestBody Membership membership) {

        try {
            Optional<Membership> membershipData = membershipService.findById(id);

            if (membershipData.isPresent()) {
                Membership membershipUpdated = membershipData.get();
                membershipUpdated.setEmployees(membership.getEmployees());
                membershipUpdated.setUsuarios(membership.getUsuarios());
                membershipUpdated.setNombre(membership.getNombre());
                membershipUpdated.setTipoMembership(membership.getTipoMembership());
                return new ResponseEntity<>(membershipUpdated, HttpStatus.NO_CONTENT);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Membership> eliminarMembership(@PathVariable("id") Long id) {
        try {
            Optional<Membership> membership = membershipService.findById(id);

            if (membership.isPresent()) {
                membershipService.eliminar(id);
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e.getCause());
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
