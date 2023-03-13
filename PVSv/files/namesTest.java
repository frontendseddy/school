package PVSv.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class namesTest {
    public static void main(String[] args) throws IOException {
        List<String> lines;
        String max = " ";
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("filesResources\\imputUkol\\LongestName.txt")));
        for (int i = 0; i < 30; i++) {
            lines = Files.readAllLines(Paths.get("filesResources\\imputUkol\\names" + (i + 1) + ".txt"));
            max = " ";
            for (String line : lines) {
                if (line.length() >= max.length()) {
                    max = line;
                }
            }
            pw.println(Paths.get("filesResources\\imputUkol\\names" + (i + 1) + ".txt") + " " + max);
        }
        pw.close();
    }
}