package XPVs.testy;

import java.util.Comparator;

public class Movies {
    String name;
    int year;
    double rating;

    public Movies(String name, int year, double rating) {
        this.name = name;
        this.year = year;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "------\n" +
                "Name: " + name + "; \n"
                + "Year: " + year + "; \n"
                + "Rating: " + rating + "/10\n";
    }

    public static Comparator<Movies> BY_NAME = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return o1.name.compareTo(o2.name);
        }
    };
    public static Comparator<Movies> BY_YEAR = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return Integer.compare(o1.year, o2.year);
        }
    };
    public static Comparator<Movies> BY_RATE = new Comparator<Movies>() {
        @Override
        public int compare(Movies o1, Movies o2) {
            return Double.compare(o1.rating, o2.rating);
        }
    };
}
