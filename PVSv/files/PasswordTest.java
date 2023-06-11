package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class PasswordTest {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("filesResources\\passwords.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\PasswordOut.txt"))));
        for (String line : lines) {
            if (line.length() >= 6) {
                pw.println(line + " good");
            } else {
                pw.println(line + " not good");
            }
        }
        pw.close();
    }
}
