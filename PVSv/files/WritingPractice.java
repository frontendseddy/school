package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class WritingPractice {
    /**
     * Vezme soubor a smaze z nej vsechny i/y a nahradi je _
     */
    static void removeGrammar() throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("filesResources\\practice\\Grammar.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\practice\\Grammar.txt"))));
        String change;
        for (String line : lines) {
            change = line.replaceAll("[iyíý]", "_");
            pw.println(change);
        }
        pw.close();
    }

    /**
     * Metoda vezme vetsi mnozstvi souboru a spoji je do jednoho
     * Pro ucely ukazky spoji vsechny soubory names1-30 do AllNames.txt
     */
    static void mergeFiles() throws IOException {
        List<String> lines;
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\practice\\AllNames.txt"), true)));
        for (int i = 0; i < 30; i++) {
            lines = Files.readAllLines(Paths.get("filesResources\\practice\\names" + (i + 1) + ".txt"));
            for (String line : lines) {
                pw.append("\n").append(line);
            }
        }
        pw.close();
    }

    /**
     * Vytvori soubor report#.txt
     * Tento soubor obsahuje vetu nize
     * Pokazde vytvori report_.txt s cislem, ktere jeste neexistuje
     * Prvni spusteni vytvori report1.txt, druhe report2.txt...
     */
    static void fileReport() throws  IOException{
        String report = "Day " + ((int) (Math.random() * 303)) + ": All quiet on the western front";
        PrintWriter pw = new PrintWriter("report.txt");

    }


    public static void main(String[] args) throws IOException{
//        mergeFiles();
//        removeGrammar();
//        fileReport();
    }
}
