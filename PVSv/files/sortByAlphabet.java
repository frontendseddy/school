package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class sortByAlphabet {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("filesResources\\nj.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("filesResources\\njOut.txt")));
        Collections.sort(lines); // by alphabet
//        Collections.reverse(lines); // reverse

        for (String line : lines ) {
            pw.println(line);
        }

        System.out.println(lines.size());
        pw.close();
    }
}
