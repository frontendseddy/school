package PVSv.files;

import java.io.IOException;
import java.io.PrintWriter;

public class WritingPractice {
    /**
     * Vezme soubor a smaze z nej vsechny i/y a nahradi je _
     */
    static void removeGrammar() throws IOException{

    }

    /**
     * Metoda vezme vetsi mnozstvi souboru a spoji je do jednoho
     * Pro ucely ukazky spoji vsechny soubory names1-30 do AllNames.txt
     */
    static void mergeFiles() throws IOException {
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
