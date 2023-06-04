package XPVs.interfacesxd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MP3 {
    static ArrayList<Track01> loadTracks(String path) {
        ArrayList<Track01> tracks = new ArrayList<>();
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            Track01 t;
            String[] attributes;
            for (String line : lines) {
                attributes = line.split(";");
                t = new Track01(attributes[0], Integer.parseInt(attributes[1]), Double.parseDouble(attributes[2]), Integer.parseInt(attributes[3]));
                tracks.add(t);
            }
        } catch (IOException e) {
            System.out.println("Could not read file");
            return null;
        }
        return tracks;
    }

    public static void main(String[] args) {
        ArrayList<Track01> tracks = loadTracks("Tracks.txt");
        Collections.sort(tracks, Track01.BY_YEAR.reversed()); //bez reversed to bude vzestupne
        for (Track01 t: tracks) {
            t.printTrack();
        }
        Collections.sort(tracks, Track01.BY_NAME.reversed()); //bez reversed to bude vzestupne
        for (Track01 t: tracks) {
            t.printTrack();
        }
        System.out.println("---TOP 10---");
        Collections.sort(tracks, Track01.BY_RAITING.reversed());
        for (int i = 0; i < 10; i++) {
            tracks.get(i).printTrack();
        }

    }

}

class Track01 implements Comparable<Track01>{
    String name;
    int yearOfRelease;
    double rating;
    int duration;

    public static final Comparator<Track01> BY_YEAR = new Comparator<Track01>() {
        @Override
        public int compare(Track01 o1, Track01 o2) {
            return o1.yearOfRelease - o2.yearOfRelease; //Integer.compare(o1.yearOfRelease, o2.yearOfRelease);
        }
    };
    public static final Comparator<Track01> BY_RAITING = new Comparator<Track01>() {
        @Override
        public int compare(Track01 o1, Track01 o2) {
            return Double.compare(o1.rating, o2.rating);
        }
    };
    public static final Comparator<Track01> BY_NAME = new Comparator<Track01>() {
        @Override
        public int compare(Track01 o1, Track01 o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public Track01(String name, int yearOfRelease, double rating, int duration) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.duration = duration;
    }

    void printTrack() {
        System.out.println(name + " " + yearOfRelease + " " + rating + " " + duration);
    }

    @Override
    public int compareTo(Track01 o) {
//        return this.name.compareTo(o.name);
        return this.yearOfRelease - o.yearOfRelease;
    }
}

//COMPARATOR

class CompareTracksByYear implements Comparator<Track01> {

    @Override
    public int compare(Track01 o1, Track01 o2) {
        return o1.yearOfRelease - o2.yearOfRelease;
    }
}
