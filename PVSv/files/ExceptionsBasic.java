package PVSv.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class ExceptionsBasic {
    // vyjimka je stav
    static int recursive (int a){
        System.out.println("Sahara sand speck #" + a);
        if (a < Integer.MAX_VALUE) {
            a = recursive(a+1);
        }
        return 42;
    }
    public static void main(String[] args) throws IOException {
        int[] arr = {1,24,79,87};
        System.out.println(arr[1]);

//        FileReader fr = new FileReader("won't find me.txt");

//        Scanner sc = new Scanner(System.in);
//        System.out.println("zadej cislo");
//        System.out.println(sc.nextInt());

//        int a = 8 / 0;
//        String a = null;
//        System.out.println(a.toLowerCase());
        recursive(0);
        System.out.println("Happy ending");
    }
}
