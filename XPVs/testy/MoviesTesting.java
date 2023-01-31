package XPVs.testy;

import XPVs.oop.nadoma.Songs;
import fileworks.DataExport;
import fileworks.DataImport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MoviesTesting {
    public static void main(String[] args) {
        DataImport di = new DataImport("ComparableMovies.txt");
        DataExport de = new DataExport("OutputComparableMovies.txt");

        Movies m;
        String line;
        String[] attributes;

        ArrayList<Movies> cinema = new ArrayList<>();

        while (di.hasNext()) {
            line = di.readLine();
            attributes = line.split(";");
            m = new Movies(attributes[0], Integer.parseInt(attributes[1]), Double.parseDouble(attributes[2]));
            //System.out.print(p);
            cinema.add(m);
        }

        //ByName
        Collections.sort(cinema, Movies.BY_NAME.reversed());
//        System.out.println(Arrays.toString(cinema.toArray()).replace("[", "").replace("]", "").replace(",", ""));
        de.writeLine(Arrays.toString(cinema.toArray()).replace("[", "").replace("]", "").replace(",", ""));
        //ByAge
        Collections.sort(cinema, Movies.BY_YEAR);
//        System.out.println("Nejstarsi: " + cinema.get(0));
        de.writeLine("Nejstarsi: " + (cinema.get(0)));
        //ByRate
        Collections.sort(cinema, Movies.BY_RATE.reversed());
//        System.out.println("TOP 10: ");
//        System.out.println("---------");
        de.writeLine("TOP 10: ");
        for (int i = 0; i < 10; i++) {
//            System.out.println(cinema.get(i));
            de.writeLine(String.valueOf(cinema.get(i)));
        }
        //
        di.finishImport();
        de.finishExport();
    }
}
