package XPVs.Kolekce;

import fileworks.DataImport;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        DataImport di = new DataImport("Tracks.txt");
        while (di.hasNext()){
            lines.add(di.readLine());

        }
        System.out.println("Line count: " + lines.size());
        System.out.println("Obsahuje Bohemian Rhapsody? " + lines.contains("Bohemian Rhapsody"));
        System.out.println("Line of AUSLANDER;2019;8.54;915 " + lines.indexOf("AUSLANDER;2019;8.54;915"));

        int charCount = 0;
        for (int i = 0; i < lines.size(); i++) {
            charCount += lines.get(i).length();
        }
        System.out.println("character count: " + charCount);
        int release2000 = 0;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).contains(";2000;")) {
                release2000++;
            }
        }
        System.out.println("Releases of 2000: " + release2000);
        di.finishImport();
    }
}