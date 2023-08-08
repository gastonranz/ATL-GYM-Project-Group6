package com.group6.gym.app.entities;

public enum TipoMembership {

    BASIC("BASIC"),
    MEDIUM("MEDIUM"),
    PRO("PRO"),
    PREMIUM("PREMIUM");

    private String tipoMembership;

    TipoMembership(String tipoMembership) {
        this.tipoMembership = tipoMembership;
    }

    public String getTipoMembership() {
        return tipoMembership;
    }
}
