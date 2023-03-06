package PVSv.files;

import java.io.*;
import java.util.Scanner;

public class Appending {
    public static void main(String[] args) throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\AppendingOut.txt"), true)));
        for (int i = 0; i < 100; i++) {
            pw.write("line num " + (i+1)); ;
        }
        pw.close();
        System.out.println();
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\AppendingOut.txt"), true)));
        for (int i = 100; i < 200; i++) {
//            pw.println("line num:" + (i+1) + "\n");
            pw.append("line num: ").append(String.valueOf(i+1)).append("\n");
        }
        pw.close();
        System.out.println("Appended another 100 lines");
    }
}
