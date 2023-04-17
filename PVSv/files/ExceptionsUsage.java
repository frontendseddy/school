package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ExceptionsUsage {
    static void printFile(String pathName) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("neexsistuje"));
        for (String line : lines) {
            System.out.println(line);
        }
    }


    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new FileWriter("neco"));
        pw.close();

        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("neexistuje"));
            bufferedReader.readLine();

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println("Cannot find file");
        } catch (IOException e) {
            System.out.println("Error reading a file");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(":(");
        }
        finally {
            bufferedReader.close();
        }
        printFile("nexo.txt");
        System.out.println("Happy ending");
    }
}
