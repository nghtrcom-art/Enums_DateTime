package com;

import com.EnumDayOfWeek.entity.DayWeek;
import com.Event.entity.Event;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Agendamento {

    public static void main(String[] args){

        LocalDateTime agora = LocalDateTime.now();

        Event evento = new Event(agora, DayWeek.SEXTA, "Exposição Zira Ziraldo");
        System.out.println(evento);

        System.out.println("\n==============================\n");
        System.out.println("ATENÇÃO O EVENTO FOI REMARCADO!");

       evento.remarcarEvento(5);
        System.out.println(evento);

        System.out.println("\n==============================\n");
        System.out.println("Fuso horário");
        evento.exibirFusos();
    }
}
