package PVSv.files;

import fileworks.DataExport;
import fileworks.DataImport;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) {
//        DataImport di = new DataImport("filesResources\\Tracks.txt");
//        String lines;
//        while (di.hasNext()) {
//            lines = di.readLine();
//            System.out.println(lines);
//        }
//        di.printFile();
//        di.finishImport();
//        System.out.println("Program slusne ukoncuji");
//        DataExport de = new DataExport("filesResources\\lines.txt");
//        for (int i = 0; i <= 150000; i++) {
//            de.writeLine(i + " radek");
//        }
//        de.finishExport();

        Scanner sc = new Scanner(new File("filesResources\\newScanner.txt"));
        sc.useLocale(Locale.US);
        sc.useDelimiter(";");
        while (sc.hasNext()) {
//            System.out.println(sc.nextLine());
//            System.out.println(sc.next());
//            System.out.println(sc.nextInt());
//            System.out.println(sc.nextDouble());
//            System.out.println(sc.nextInt());
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
