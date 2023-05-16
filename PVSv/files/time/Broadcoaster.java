package PVSv.files.time;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

public class Broadcoaster {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("Tracks.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("Tracks-Broadcoaster.txt")));
        String randomDate = "";
        LocalDate date;
        Random random = new Random();
        random.nextInt();
        for (String line : lines) {
            date = LocalDate.of(2023, random.nextInt(1, 13), random.nextInt(1, 28));
            randomDate = ";" + date.toString();
            pw.println(line + randomDate);
        }
        pw.close();
    }
}
