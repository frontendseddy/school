package PVSv.files.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.EventListener;
//Vytvořit třídu eventScheduler{}
//        > má v sobě atribut ArrayList<Meeting>
//Třída Meeting:
//        má datum, čas začátku, dobu trvání v minutách
//
//Do listu třídy eventScheduler lze přidávat na jeden den:
//        max 2 meetingy,
//        Meetingy musí být po poledni,
//        Meetingy se nemohou překrývat.

public class EventScheduler {
   ArrayList<Meeting> schedule;

   public EventScheduler(ArrayList<Meeting> schedule) {
       this.schedule = schedule;
   }
   boolean addDefult(Meeting meeting){
       //přidá první zápis
       schedule.add(meeting);
       System.out.println("Proběhlo úspěšně");
       return true;
   }

   boolean addMeeting(Meeting meeting) {

       if (meeting.begin.isAfter(LocalTime.NOON) && coverage(meeting) && isNotTwoPerDay(meeting)) {
           schedule.add(meeting);
           return true;
       }
       return coverage(meeting);
   }

   boolean coverage(Meeting another) {

       for (Meeting meeting : schedule) {
           if (another.begin.isAfter(meeting.getEnd()) && another.begin.isBefore(meeting.getEnd())) {
               return true;
           }
       }
       return false;
   }

   boolean isNotTwoPerDay(Meeting another) {
       int counter = 0;
       for (Meeting meeting : schedule) {
            if (meeting.date.equals(another.date)) {
                counter++;
                System.out.println(counter);
            }
       }
       return counter <= 2;
   }

    static class Meeting {
       LocalDate date;
       LocalTime begin;
       int durationMin;

        public Meeting(LocalDate date, LocalTime begin, int durationMin) {
            this.date = date;
            this.begin = begin;
            this.durationMin = durationMin;
        }

        LocalTime getEnd() {
            return begin.plusMinutes(durationMin);
        }
    }

    public static void main(String[] args) {
       EventScheduler scheduler = new EventScheduler(new ArrayList<Meeting>());



        Meeting meeting1 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(12, 30), 60);
        Meeting meeting2 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(13, 45), 60);
        Meeting meeting3 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(14, 50), 60);
        Meeting meeting4 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(15, 55), 60);
        Meeting meeting5 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(17, 01), 60);
        scheduler.addDefult(meeting1);

        System.out.println(scheduler.addMeeting(meeting2));
    }

}
