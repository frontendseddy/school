package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileAnalysis {
    public static void main(String[] args) throws IOException {
        //lines, word, char
        List<String> lines = Files.readAllLines(Paths.get("filesResources\\poem.txt"));

        int charCount = 0, wordCount = 0;
        for (String line : lines) {
            charCount += line.length();
        }
        for (String line : lines) {
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            wordCount++;
        }
        System.out.println("Line: " + lines.size());
        System.out.println("Words: " + wordCount);
        System.out.println("Char: " + charCount);
    }
}
