package PVSv.files.time;

import java.time.LocalDate;
import java.time.LocalTime;
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

class EventScheduler {
    ArrayList<Meeting> meetings = new ArrayList<Meeting>();

    private static class Meeting {
        String name;
        LocalDate ld;
        LocalTime startTime;
        int duration;

        public Meeting(String name, LocalDate ld, LocalTime startTime, int duration) {
            this.name = name;
            this.ld = ld;
            this.startTime = startTime;
            this.duration = duration;
        }
    }



    public void addMeeting(Meeting meeting) {
        if (meetings.size() <= 2 && meeting.startTime.isAfter(LocalTime.NOON) && !overlapping(meeting))  { // && dopsat překrývání
            meetings.add(meeting);
            System.out.println("Přidal se meeting");
        }
        else {
            System.out.println("Neni mozne pridat meeting");
        }
    }

    public boolean overlapping(Meeting meeting) {
        for (Meeting m : meetings) {
            LocalTime startFirstMeeting = m.startTime;
            LocalTime endFirstMeeting = m.startTime.plusMinutes(m.duration);
            LocalTime startSecondMeeting = meeting.startTime;
            LocalTime endSecondMeeting = meeting.startTime.plusMinutes(meeting.duration);
            if (endFirstMeeting.isBefore(startSecondMeeting)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Meeting> getMeetings() {
        return meetings;
    }

    public static void main(String[] args) {
        EventScheduler ev = new EventScheduler();

        Meeting meeting1 = new Meeting("Meeting1", LocalDate.of(2023, 4, 27), LocalTime.of(13, 0, 0), 60);
        Meeting meeting2 = new Meeting("Meeting2", LocalDate.of(2023, 4, 27), LocalTime.of(14, 30, 0), 60);

        ev.addMeeting(meeting1);
        ev.addMeeting(meeting2);

        System.out.println("---");
        System.out.println(ev.getMeetings());
    }
}
