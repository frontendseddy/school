package PVSv.files;

import fileworks.DataExport;

import java.io.*;

public class Writing {
    public static void main(String[] args) throws IOException {
//        DataExport de = new DataExport("filesResources\\output\\out.txt");
//        de.writeLine("New line, new text");// prilepi '\n'
//        de.writeString("Hello");
//        de.writeString(" World!");
//        de.writeNewLine();// (\n)
//        de.writeString("And another niew line");
//        de.finishExport();

//        FileWriter fw = new FileWriter(new File("filesResources\\output\\out.txt"));
//        fw.write("Hello world text\n");
//        for (int i = 0; i < 100; i++) {
//            fw.write(String.valueOf(i + "\n"));
//            //apendovat - prilep na konec souboru
//        }
//        fw.close();

//        BufferedWriter bw = new BufferedWriter(new FileWriter(new File("filesResources\\output\\out.txt")));
//        for (int i = 0; i < 10000; i++) {
//            bw.write(String.valueOf(1+i));
//        }
////        bw.flush(); //vyblej celej buffer do souboru a pocitej s tim, ze tam jeste neco budu zapisovat
//        bw.close();

        // umi to same jako bufferedwriter, ale jinak
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\out.txt"))));
        pw.println("Hello world!");
        pw.close();
    }
}
