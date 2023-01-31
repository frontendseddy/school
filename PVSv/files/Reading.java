package PVSv.files;

import fileworks.DataExport;
import fileworks.DataImport;

public class Reading {
    public static void main(String[] args) {
        DataImport di = new DataImport("filesResources\\Tracks.txt");
        String lines;
//        while (di.hasNext()) {
//            lines = di.readLine();
//            System.out.println(lines);
//        }
        di.printFile();
        di.finishImport();
        System.out.println("Program slusne ukoncuji");
        DataExport de = new DataExport("filesResources\\lines.txt");
        for (int i = 0; i <= 150000; i++) {
            de.writeLine(i + " radek");
        }
        de.finishExport();
    }
}
