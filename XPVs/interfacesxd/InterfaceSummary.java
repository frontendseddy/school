package XPVs.interfacesxd;

import java.time.LocalTime;
import java.util.Arrays;

public class InterfaceSummary {
    //musi se pouzivat spolecne s 2/2
    static void printDuration(Playable something){
        something.printDuration();
    }

    public static void main(String[] args) {
        Film movie = new Film("Django Unchained", "Quentin Tarantino", 2012, 9902);
        Track song = new Track("Dream on", "Aerosmith", 1978, 284);
        //bud se pouziva tohle 1/2
//        song.play();
//        song.printDuration();
//        movie.play();
//        movie.printDuration();

        // nebo se pouziva tohle 2/2
        Playable[] playables = {movie, song};
        for (Playable playable : playables) {
            playable.play();
            printDuration(playable);
            System.out.println();
        }
//        Arrays.sort(playables);
    }
}
class Track implements Playable, Comparable<Track01>{
    String name;
    String author;
    int yearOfRelease;
    int duration;

    public Track(String name, String author, int yearOfRelease, int duration) {
        this.name = name;
        this.author = author;
        this.yearOfRelease = yearOfRelease;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Currently playing song: " + name + " by " + author);
    }

    @Override
    public void printDuration() {
        System.out.println("Duration of " + name + " " + (duration/60) + ":" + (duration%60));
    }

    @Override
    public int compareTo(Track01 o) {
        return Integer.compare(duration, o.duration);
    }
}
class Film implements Playable, Comparable<Film>{
    String name;
    String director;
    int yearOfRelease;
    int duration;

    public Film(String name, String director, int yearOfRelease, int duration) {
        this.name = name;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.duration = duration;
    }

    @Override
    public void play() {
        System.out.println("Currently playing movie: " + name + " " + yearOfRelease);
    }

    @Override
    public void printDuration() {
        LocalTime time = LocalTime.of(0,0,0);
        System.out.println("Duration of " + name + " " + time.plusSeconds(duration).toString());
    }

    @Override
    public int compareTo(Film o) {
        return name.compareTo(o.name);
    }
}

interface Playable {
    void play();
    void printDuration();
}
//word count
//for (String line : lines) {
//        for (int i = 0; i < line.length(); i++) {
//        if (line.charAt(i) == ' ') {
//        wordCount++;
//        }
//        }
//        wordCount++;
//        }
//        pw.println("Words: " + wordCount);


