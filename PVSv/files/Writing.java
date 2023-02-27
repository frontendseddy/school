package PVSv.files;

import fileworks.DataExport;

import java.io.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Writing {
    public static void main(String[] args) throws IOException {
//        DataExport de = new DataExport("filesResources\\output\\out.txt");
//        de.writeLine("New line, new text");// prilepi '\n'
//        de.writeString("Hello");
//        de.writeString(" World!");
//        de.writeNewLine();// (\n);
//        de.writeString("And another niew line");
//        de.finishExport();

        //vypisuje po radkach
//        FileWriter fw = new FileWriter(new File("filesResources\\output\\out.txt"));
//        fw.write("Hello world text\n");
//        for (int i = 0; i < 100; i++) {
//            fw.write(String.valueOf(i + "\n"));
//            //apendovat - prilep na konec souboru
//        }
//        fw.close();

        //umi odradkovani
        //princip bufferovani - dava se to tam po kouskach
//        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("filesResources\\output\\out.txt")));
//        for (int i = 0; i < 10000; i++) {
//            bw.write(String.valueOf(1+i));
//            bw.newLine();
//        }
////        bw.flush(); //vyblej celej buffer do souboru a pocitej s tim, ze tam jeste neco budu zapisovat
//        bw.close();

        // umi to same jako bufferedwriter, ale jinak
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\out.txt"))));
//        int wordLength = 12;
//        Random random = new Random();
//        StringBuilder sb = new StringBuilder(wordLength);
//        for(int i = 0; i < wordLength; i++) {
//            char pom = (char) ('a' + random.nextInt('z' - 'a'));
            //pw.printLine();
            //pw.printf();
//            sb.append(pom);
//        }
//        System.out.println(sb.toString());
        //random number
        int length = 10;
        for (int i = 0; i < length; i++) { //pocet radku
            System.out.println(ThreadLocalRandom.current().nextInt(0, 100000));
        }

        //random word
        System.out.println("---|||---");
        Random rd = new Random();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int length1 = 3;
        //int length2 = 7;
        int length2 = ThreadLocalRandom.current().nextInt(1, 8);
        for (int i = 0; i < length1; i++) { //pocet radku
            for (int j = 0; j < length2; j++) { //pocet pismen
                System.out.print((char) ('a' + rd.nextInt(alphabet.length())));
            }
            //System.out.print(" "); // slovo mezera
            System.out.println(); // slovo odradkovani
        }
        //System.out.println(randomNum);
        //pw.println(randomStrings);
        pw.close();
    }
}
