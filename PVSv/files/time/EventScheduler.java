package PVSv.files.time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
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

    public static void main(String[] args) {
        EventScheduler scheduler = new EventScheduler(new ArrayList<Meeting>());

        Meeting meeting1 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(12, 30), 60);
        Meeting meeting2 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(13, 45), 60);
        Meeting meeting3 = new Meeting(LocalDate.of(2023, 5, 14), LocalTime.of(14, 50), 60);
        
        System.out.println(scheduler.addMeeting(meeting1));
        System.out.println(scheduler.addMeeting(meeting2));
        System.out.println(scheduler.addMeeting(meeting3));
    }

    boolean addMeeting(Meeting meeting) {
        if (meeting.begin.isAfter(LocalTime.NOON) && maxTwoPerDay(meeting) && coverage(meeting)) {
            schedule.add(meeting);
            return true;
        }
        return false;
    }

    boolean coverage(Meeting another) {
        schedule.add(another);
        for (Meeting meeting : schedule) {
            LocalTime start1 = meeting.begin;
            LocalTime end1 = start1.plusMinutes(meeting.durationMin);
            LocalTime start2 = another.begin;
            LocalTime end2 = start2.plusMinutes(another.durationMin);
            if (start1.isBefore(end2) && start2.isBefore(end1)) {
                return true;
            }
        }
        return false;
    }

    boolean maxTwoPerDay(Meeting another) {
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
    }
}
