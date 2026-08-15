package com.EnumDayOfWeek.entity;

public enum DayWeek {

    DOMINGO("Domingo"),
    SEGUNDA("Segunda-Feira"),
    TERÇA("Teça-Feira"),
    QUARTA("Quarta-Feira"),
    QUINTA("Quinta-Feira"),
    SEXTA("Sexta-Feira");

    private final String diaSemana;

    DayWeek(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String toString(){
        return "Dia do evento " + diaSemana;

    }
}
