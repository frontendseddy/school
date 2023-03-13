package PVSv.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.MessageDigestSpi;
import java.util.List;

public class FileEncryption {

//    static final int CAESAR_KEY = 3;

    static String encrypt (String message, int key){
        StringBuilder sb = new StringBuilder();
        char c;
        for (int i = 0; i < message.length(); i++) {
            c = message.charAt(i);
            if(Character.isLetter(c)) {
                c = (char)(message.charAt(i) + key);
                if ((Character.isLowerCase(message.charAt(i))) && c > 'z'|| (Character.isUpperCase(message.charAt(i))) && c > 'Z'){
                    c = (char)(message.charAt(i) - (26 - key));
                }
            }
            sb.append(c);
        }
        return sb.toString();
//        return ";";
    }

    static String decipher(String message, int key){
        return encrypt(message, 26-key);
    }

    public static void main(String[] args) throws IOException {

        List<String> lines = Files.readAllLines(Paths.get("filesResources\\poem.txt"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("filesResources\\output\\encrypted.txt"), true)));
        for (String line: lines) {
//           pw.println(encrypt(line, 3));
           pw.println(decipher(line ,0));
        }
        pw.close();
    }
}
