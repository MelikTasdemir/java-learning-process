package day25;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DaytimeFormatterInt {
    public static void main(String[] args) {

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yy ,MMMM -dd EEEE");

        LocalDate today = LocalDate.now();
        System.out.println(today.format(df));


        DateTimeFormatter tf = DateTimeFormatter.ofPattern("HH:mm a");

        LocalTime time1 = LocalTime.of(7,22);

        System.out.println(time1.format(tf));

        System.out.println("==========================================");


        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/y/EEEE  HH:mm a");

        LocalDateTime str = LocalDateTime.now();

        System.out.println(str.format(dtf));










    }
}
