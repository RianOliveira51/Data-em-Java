package com.example.datetimecriando;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;

import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

@SpringBootApplication
public class DateTimeCriandoApplication {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        // classe para formatar data.
        //https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // instanciando a partir de um padrão.
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); // instanciando a partir de um padrão.

       // para criar uma variavel do tipo Date, usamos o comando LocalDate.
        // para pegar a hora de agora, usamos a função static Local LocalDate.now()
       LocalDate d01 = LocalDate.now();

       //Para criar data e hora, usamos LocalDataTime
       LocalDateTime d02 = LocalDateTime.now();

       //Criando com o Instant - Data Hora Global
        Instant d03 = Instant.now();

        // Criando data no formato ISO 8601
        // usamos parse para digitar manualmente a hora.
        LocalDate d04 = LocalDate.parse("2022-06-02");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        //Formatação da data.
        //não aceita assim, pois o parse não sabe qual é o dia/mes/ano
        //Errado: LocalDate d08 = LocalDate.parse("20/07/2022");
        //Certo
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); // customizado.
        //LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")); // customizado.
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:20", fmt2);

        //Instanciando Local Date, passadno dia,mes, ano isoladamente.
        //of - aceita ano,mes e dia, nessa ordem
        LocalDate d10 = LocalDate.of(2022,7,20);
        LocalDateTime d11 = LocalDateTime.of(2022,07,20,1,30);

        //quando usamos o println, é como se tivessemos usando d01.toString
        //para transformar um objeto em data hora no formato ISO 8601, só usar o toString
        System.out.println("Somente Data = " + d01);
        System.out.println("Data + horario = " + d02);
        System.out.println("Intant = " + d03);
        System.out.println("Data ISO 8601 = " + d04);
        System.out.println("DataTime ISO 8601  = " + d05);
        System.out.println("Instant ISO 8601  = " + d06);
        System.out.println("Instant ISO 8601  = " + d07);
        System.out.println("Formatação de Data  = " + d08);
        System.out.println("Formatação de Data/hora  = " + d09);
        System.out.println("Instaciando isoladamente = " + d10);
        System.out.println("Instaciando isoladamente = " + d11);

    }

}
