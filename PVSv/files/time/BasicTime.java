package PVSv.files.time;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class BasicTime {
    public static void main(String[] args) {
        LocalDate someTime = LocalDate.now().minusDays(1);

        System.out.println(someTime.getDayOfMonth());
        System.out.println(someTime.getDayOfWeek());
        System.out.println(someTime.getDayOfYear());
        System.out.println(someTime.getMonth());
        System.out.println(someTime.getMonthValue());
        System.out.println(someTime.getYear());

        if (someTime.getDayOfWeek() == DayOfWeek.SATURDAY || someTime.getDayOfWeek() == DayOfWeek.SUNDAY) {
            System.out.println("Is weekend");
        }
        else {
            System.out.println("Is not a weekend");
        }
    }
}
