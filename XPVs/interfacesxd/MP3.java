package XPVs.interfacesxd;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MP3 {
    static ArrayList<Track> loadTracks(String path) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));
            ArrayList<Track> tracks = new ArrayList<>();
            Track t;
            String[] attributes;
            for (String line : lines) {
                attributes = line.split(";");
                t = new Track(attributes[0], Integer.parseInt(attributes[1]), Double.parseDouble(attributes[2]), Integer.parseInt(attributes[3]));
                tracks.add(t);
            }return tracks;
        } catch (IOException e) {
            System.out.println("Could not read file");
            return null;
        }
    }

    public static void main(String[] args) {
        ArrayList<Track> tracks = loadTracks("Tracks.txt");
        Collections.sort(tracks, new CompareTracksByYear());
        for (Track t: tracks) {
            t.printTrack();
        }

    }

}

class Track implements Comparable<Track>{
    String name;
    int yearOfRelease;
    double rating;
    int duration;

//    public static final Comparator<Track> BY_YEAR = new CompareTracksByYear() {
//
//    }

    public Track(String name, int yearOfRelease, double rating, int duration) {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.duration = duration;
    }

    void printTrack() {
        System.out.println(name + " " + yearOfRelease + " " + rating + " " + duration);
    }

    @Override
    public int compareTo(Track o) {
//        return this.name.compareTo(o.name);
        return this.yearOfRelease - o.yearOfRelease;
    }


}

//COMPARATOR

class CompareTracksByYear implements Comparator<Track> {

    @Override
    public int compare(Track o1, Track o2) {
        return o1.yearOfRelease - o2.yearOfRelease;
    }
}
