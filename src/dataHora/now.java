package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class now {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-08-09");
        LocalDateTime d05 = LocalDateTime.parse("2022-08-09T17:54:00");
        Instant d06 = Instant.parse("2022-08-09T17:54:00Z");
        Instant d07 = Instant.parse("2022-08-09T17:54:00-03:00");

        LocalDate d08 = LocalDate.parse("09/08/2024", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("09/08/2024 18:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2024, 8, 9);
        LocalDateTime d11 = LocalDateTime.of(2024, 8, 9, 18, 05);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
    }
}
