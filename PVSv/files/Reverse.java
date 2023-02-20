package PVSv.files;

import javax.sound.sampled.Line;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Reverse {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("filesResources\\Tracks.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\TracksReverse.txt"))));
        for (int i = 0; i < lines.size(); i++) {
            pw.println(lines.get(lines.size()-1-i));
        }
        pw.close();
    }
}
