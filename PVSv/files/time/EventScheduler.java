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

   boolean addMeeting(Meeting meeting) {
       if (meeting.begin.isAfter(LocalTime.NOON) && coverage(meeting) && twoPerDay(meeting)) {
           System.out.println("It is OK");
           schedule.add(meeting);
           return true;
       } else {
           System.out.println("Something went wrong!");
           return false;
       }
   }

   boolean coverage(Meeting another) {
       for (Meeting meeting : schedule) {
           if (meeting.begin.isAfter(meeting.getEnd()) || another.getEnd().isBefore(meeting.begin)) {
               return true;
           }
       }
       return false;
   }

   boolean twoPerDay(Meeting another) {
       int counter = 0;
       for (Meeting meeting : schedule) {
            if (meeting.date.equals(another.date)) {
                counter++;
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
        Meeting meeting3 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(14, 0), 30);

        scheduler.addMeeting(meeting1);
        scheduler.addMeeting(meeting2);
        scheduler.addMeeting(meeting3);
    }

}
