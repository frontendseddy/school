package XPVs.testy;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2Prakticka {

    public static void main(String[] args) throws IOException {
        File[] files = new File("filesResources\\taskStuff").listFiles();
        ArrayList<File> filteredFiles = new ArrayList<>();
        StringBuilder fileName = new StringBuilder();
        StringBuilder fileContents = new StringBuilder();


        for (File file : files) {
            if ((file.length() / 1024 < 500) && file.getName().endsWith(".txt")) {
                filteredFiles.add(file);
                fileName.append(file.getName().substring(0, file.getName().lastIndexOf(".")));
                List<String> lines = Files.readAllLines(Paths.get(file.getPath()));
                for (String line : lines) {
                    fileContents.append(line).append("\n");
                }
            }
        }
        Comparator<File> BY_SIZE = new Comparator<File>() {
            @Override
            public int compare(File o1, File o2) {
                return (int) (o1.length() - o2.length());
            }
        };
        Collections.sort(filteredFiles, BY_SIZE);

        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName.toString() + ".txt")));
        pw.println(fileContents.toString());
        pw.close();
    }
}
