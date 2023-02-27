package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        String path = "TBD";
//
        int all = 0;
        int totalAmount = 0;
        for (int i = 0; i < 10; i++) {
            path = "filesResources\\output\\out1" + (i+1) + ".txt";
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
            for (int j = 0; j < 100; j++) {
                pw.println(ThreadLocalRandom.current().nextInt(-10000, 10000));
            }
            pw.close();
            totalAmount = intervalAnalysis(path, 0, 1000);
        }
        System.out.println("All files contained " + totalAmount + "numbers from interval");
        System.out.println("arPrumer" + "");

//        cleanUp("out", 3);

//        int length = 10000;
//        for (int i = 0; i < length; i++) { //pocet radku
//            pw.println(ThreadLocalRandom.current().nextInt(-10000, 10000));
//        }
//        pw.close();
//        closeList<String> lines = Files.readAllLines(Paths.get(path));
//        System.out.println(lines);

    }
    static void cleanUp(String basicName, int amount) {
        File toDelete;
        for (int i = 0; i < amount; i++) {
            toDelete = new File("filesResources\\output\\"+ basicName + (i+1) + ".txt");
            if (toDelete.delete()) {
                System.out.println(toDelete.getName() + " was deleted.");
            }
            else {
                System.out.println("Could not delete " + toDelete.getName());
            }
        }
    }
    static int intervalAnalysis(String path, int min, int max) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        int amount = 0;
        for (String line : lines) {
            if (max > Integer.parseInt(line) && min < Integer.parseInt(line)) {
                amount++;
            }
        }
        System.out.println(path + " contains " + amount + " numbers from interval " + min + " - " + max);
        return amount;
    }
    static int prumer(String path) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(path));
        int amount = 0;
        int all = 0;
        for (String line : lines) {
            all += line.length();
        }
        return all;
    }

}
