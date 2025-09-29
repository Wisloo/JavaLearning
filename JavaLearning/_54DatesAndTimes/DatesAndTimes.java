package _54DatesAndTimes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DatesAndTimes {
    public static void main(String[] args) {
        // How to work with DATES & TIMES using Java
        // (LocalDate, LocalTime, LocalDateTime, UTC timestamp)
        /* LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime DateTime = LocalDateTime.now();

        System.out.println(DateTime);


        Instant instant = Instant.now();
        System.out.println(instant); */

        /* LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
        String newDateTime = dateTime.format(formatter);
        System.out.println(newDateTime); */
        LocalDateTime dateTime1 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        if(dateTime1.isBefore(dateTime2)) {
            System.out.println(dateTime1 + " is earlier than " + dateTime2);
        } else if (dateTime1.isAfter(dateTime2)) {
            System.out.println(dateTime1 + " is later than " + dateTime2);
        } else if (dateTime1.isEqual(dateTime2)) {
            System.out.println(dateTime1 + " is the same as " + dateTime2);
        }
    }
}
