package PVSv.files;

import java.io.*;

public class Appending {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\AppendingOut.txt"))));
        for (int i = 0; i < 100; i++) {
            pw.println("line num " + (i+1)) ;
        }
        pw.close();
    }
}
