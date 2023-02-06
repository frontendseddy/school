package PVSv.files;

import fileworks.DataExport;
import fileworks.DataImport;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws IOException {
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

          // cte po radkach
//        Scanner sc = new Scanner(new File("filesResources\\Tracks.txt"));
//        sc.useLocale(Locale.US);
//        sc.useDelimiter(";");
//        while (sc.hasNext()) {
////            System.out.println(sc.nextLine());
////            System.out.println(sc.next());
////            System.out.println(sc.nextInt());
////            System.out.println(sc.nextDouble());
////            System.out.println(sc.nextInt());
//            System.out.println(sc.nextLine());
//        }
//        sc.close();

        //pvsv 6.2.2023 ----------
        // cte po znacich
//        FileReader fr = new FileReader(new File("filesResources\\Tracks.txt"));
//        int character = fr.read();
//        while (character != -1) {
//            System.out.print((char) character); //pretypovani na char, jinak to vypise pouze cisla
//            character = fr.read();
//        }
//        fr.close();

//        BufferedReader br = new BufferedReader(new FileReader(new File("filesResources\\Tracks.txt")));
//        String line = br.readLine();
//        while (line != null) {
//            System.out.println(line);
//            line = br.readLine();
//        }
//        br.close();

        List<String> lines = Files.readAllLines(Paths.get("filesResources\\Tracks.txt"));
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
