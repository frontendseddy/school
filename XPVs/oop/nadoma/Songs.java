package XPVs.oop.nadoma;

import java.util.Comparator;

public class Songs {

    int year, minutes, seconds;
    double rating;
    String name, time;

    public Songs(int year, double rating, int time, String name) {
        this.year = year;
        this.rating = rating;
        this.name = name;
        this.minutes = time / 60;
        this.seconds = time % 60;
        this.time = minutes + " : " + seconds;
    }

    @Override
    public String toString() {
        return "Name : " + name + " | Time: " + time + "\n" +
                "Year: " + year + "\n" +
                "Raiting : " + rating + "\n" +
                "--------------------\n\n";
    }

    //ByNECO
    public static Comparator<Songs> BY_YEAR = new Comparator<Songs>() {
        @Override
        public int compare(Songs o1, Songs o2) {
            return Integer.compare(o1.year, o2.year);
        }
    };
    public static Comparator<Songs> BY_RATE = new Comparator<Songs>() {
        @Override
        public int compare(Songs o1, Songs o2) {
            return Double.compare(o1.rating, o2.rating);
        }
    };
    public static Comparator<Songs> BY_TIME = new Comparator<Songs>() {
        @Override
        public int compare(Songs o1, Songs o2) {
            return Integer.compare(o1.minutes * 60 + o1.seconds, o2.minutes * 60 + o2.seconds);
        }
    };
    public static Comparator<Songs> BY_NAME = new Comparator<Songs>() {
        @Override
        public int compare(Songs o1, Songs o2) {
            return o1.name.compareTo(o2.name);
        }
    };
}
