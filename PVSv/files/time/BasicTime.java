package PVSv.files.time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;

public class BasicTime {
    public static void main(String[] args) {
//        LocalDate someTime = LocalDate.of(2023, 4, 24);
//        someTime.isLeapYear(); //prestupny rok
//        System.out.println(someTime.getDayOfMonth());
//        System.out.println(someTime.getDayOfWeek());
//        System.out.println(someTime.getMonthValue());
//        System.out.println(someTime.getMonth());
//        System.out.println(someTime.getDayOfYear());
//        System.out.println(someTime.getYear());
//
//        if (someTime.getDayOfWeek() == DayOfWeek.SATURDAY || someTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
//            System.out.println("Is weekend");
//        } else {
//            System.out.println("Is not a weekend");
//        }

        LocalTime clock = LocalTime.now();
        System.out.println(clock.toString());
        System.out.println(clock.getHour());
        System.out.println(clock.getMinute());
        System.out.println(clock.getSecond());
        System.out.println(clock.isBefore(LocalTime.MIDNIGHT));
        System.out.println(clock);
    }
}
