package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FilePractice {
    public static void main(String[] args) throws IOException {
        String path = "filesResources\\output\\out2.txt";
//        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));

        for (int i = 0; i < 10; i++) {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File(path))));
            for (int j = 0; j < 10000; j++) {
                pw.println(ThreadLocalRandom.current().nextInt(-10000, 10000));
                path.split("");
            }
        }


//        int length = 10000;
//        for (int i = 0; i < length; i++) { //pocet radku
//            pw.println(ThreadLocalRandom.current().nextInt(-10000, 10000));
//        }
//        pw.close();
//        closeList<String> lines = Files.readAllLines(Paths.get(path));
//        System.out.println(lines);

    }
}
