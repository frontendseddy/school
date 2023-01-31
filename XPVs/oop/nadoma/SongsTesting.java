package XPVs.oop.nadoma;

import fileworks.DataExport;
import fileworks.DataImport;

import java.util.ArrayList;
import java.util.Collections;

public class SongsTesting {
    public static void main(String[] args) {
        DataImport di = new DataImport("Tracks.txt");

        DataExport YearE = new DataExport("OutputByYear.txt");
        DataExport NameE = new DataExport("OutputByName.txt");
        DataExport RateE = new DataExport("OutputByRate.txt");
        DataExport TimeE = new DataExport("OutputByTime.txt");

        Songs s;
        String line;
        String[] attributes;

        //Sorting
        ArrayList<Songs> playList = new ArrayList<>();
        //

        while (di.hasNext()) {
            line = di.readLine();
            attributes = line.split(";");
            s = new Songs(Integer.parseInt(attributes[1]), Double.parseDouble(attributes[2]), Integer.parseInt(attributes[3]), attributes[0]);
            //System.out.print(p);
            playList.add(s);

        }
        //ByYear
        Collections.sort(playList, Songs.BY_YEAR);
        YearE.writeString(playList.toString());
        //
        //ByRate
        Collections.sort(playList, Songs.BY_RATE);
        RateE.writeString(playList.toString());
        //
        //ByTime
        Collections.sort(playList, Songs.BY_TIME);
        TimeE.writeString(playList.toString());
        //
        //ByName
        Collections.sort(playList, Songs.BY_NAME);
        NameE.writeString(playList.toString());
        //

        //zapis do souboru
        di.finishImport();

        YearE.finishExport();
        NameE.finishExport();
        RateE.finishExport();
        TimeE.finishExport();
    }
}
