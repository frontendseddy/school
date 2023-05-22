package PVSv.files.time;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BroadCastReader {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("Tracks-Broadcoaster.txt"));
        DatedTracks tracks;
        String[] attributes;
        ArrayList<DatedTracks> datedTracks = new ArrayList<>();
        for (String line : lines) {
            attributes = line.split(";");
            tracks = new DatedTracks(attributes[0], Integer.parseInt(attributes[1]), Integer.parseInt(attributes[3]), Double.parseDouble(attributes[2]), LocalDate.parse(attributes[4]));
            tracks.printBroadCast();
            datedTracks.add(tracks);
        }

        Collections.sort(datedTracks, DatedTracks.BY_DATE);
        for (DatedTracks datedTracks1 : datedTracks) {
            datedTracks1.printBroadCast();
        }
    }

}
class DatedTracks {
    String name;
    int yearOfRelease, duration;
    double rating;
    LocalDate bradcoast;

    public static final Comparator<DatedTracks> BY_DATE = new Comparator<DatedTracks>() {
        @Override
        public int compare(DatedTracks o1, DatedTracks o2) {
            return o1.bradcoast.compareTo(o2.bradcoast);
        }
    };

    public DatedTracks(String name, int yearOfRelease, int duration, double rating, LocalDate bradcoast) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.duration = duration;
        this.rating = rating;
        this.bradcoast = bradcoast;
    }

    void printBroadCast() {
        System.out.println(name + " broadcasting on: " + bradcoast.toString());
    }
}
