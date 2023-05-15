package XPVs.testy;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Meeting {
    LocalDateTime date;
    String location;
    ArrayList<Meeting> meetings;

    public Meeting(LocalDateTime date, String location) {
        this.date = date;
        this.location = location;
    }

    public Meeting(ArrayList<Meeting> meetings) {
        this.meetings = meetings;
    }

    public static void main(String[] args) {
        Meeting idk = new Meeting(new ArrayList<Meeting>());

        Meeting meeting1 = new Meeting(LocalDateTime.of(2023, 5, 23, 13, 40), "Brno");
        Meeting meeting2 = new Meeting(LocalDateTime.of(2023, 6, 24, 13, 30), "Plzen");
        Meeting meeting3 = new Meeting(LocalDateTime.of(2023, 7, 23, 13, 15), "Ostrava");

        System.out.println(idk.addMeeting(meeting1));
        System.out.println(idk.addMeeting(meeting2));
        System.out.println(idk.addMeeting(meeting3));
    }

    boolean addMeeting(Meeting another) {
        meetings.add(another);
        for (Meeting meeting : meetings) {
            if (!(meeting.getDate().getDayOfWeek().equals(DayOfWeek.SATURDAY)) || !(meeting.getDate().getDayOfWeek().equals(DayOfWeek.SUNDAY)) && another.getDate().isAfter(meeting.getDate().plusDays(10)) && meeting.getDate().getMonth().equals(Month.AUGUST)) {
                meetings.add(meeting);
                return true;
            }
        }
        return false;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }
}




