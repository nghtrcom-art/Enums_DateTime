package com.Event.entity;
import com.EnumDayOfWeek.entity.DayWeek;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Event {

    private String nomeDoEvento;
    private DayWeek diaDaSemana;
    private LocalDateTime DataTime;

    public Event(LocalDateTime dataTime, DayWeek diaDaSemana, String nomeDoEvento) {
        this.DataTime = dataTime;
        this.diaDaSemana = diaDaSemana;
        this.nomeDoEvento = nomeDoEvento;
    }

    public LocalDateTime getDataTime() {
        return DataTime;
    }

    public DayWeek getDiaDaSemana() {
        return diaDaSemana;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }

    public String getformataData() {

        DateTimeFormatter formatador =
                DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm");

        return DataTime.format(formatador);
    }

    public void remarcarEvento(int dias) {
        DataTime = DataTime.plusDays(dias);
    }

    public void exibirFusos() {

        ZonedDateTime saoPaulo =
                DataTime.atZone(ZoneId.of("America/Sao_Paulo"));

        ZonedDateTime gmt =
                saoPaulo.withZoneSameInstant(ZoneId.of("GMT"));

        System.out.println("São Paulo: " + saoPaulo);
        System.out.println("GMT: " + gmt);
    }

    @Override
    public String toString() {
        return "Evento: '" + nomeDoEvento + "\n" +
                "Data e hora do Evento: " + getformataData() + "\n"+
                "Dia da semana: " + diaDaSemana ;
    }
}
