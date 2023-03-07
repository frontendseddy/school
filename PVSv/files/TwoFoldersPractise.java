package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TwoFoldersPractise {
    public static void main(String[] args) throws IOException {
        //stejne slova a pocet stejnych slov
//        List<String> line0 = Files.readAllLines(Paths.get("filesResources\\forMe\\data1.txt"));
//        List<String> line1 = Files.readAllLines(Paths.get("filesResources\\forMe\\data2.txt"));
//        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\forMe\\dataOUT.txt"))));
//        int wordCount = 0;
//        for (String lines0 : line0) {
//            for (String lines1 : line1) {
//                if (lines0.equals(lines1)) {
//                    pw.println(lines0 + ": is same");
//                    for (int i = 0; i < lines0.length(); i++) {
//                        if (lines0.charAt(i) == ' ') {
//                            wordCount++;
//                        }
//                    }
//                    wordCount++;
//                }
//            }
//        }
//        pw.println("same words: " + wordCount);
//        pw.close();

        //append data z appendData1.txt do appendData2.txt
        List<String> line0 = Files.readAllLines(Paths.get("filesResources\\forMe\\appendData1.txt"));
        List<String> line1 = Files.readAllLines(Paths.get("filesResources\\forMe\\appendData2.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\forMe\\appendData2.txt"), true)));
        pw.append("added words from appendData1.txt: ");
        for (String lines : line0) {
            pw.append("\n").append(lines);
        }
        pw.close();
    }
}
