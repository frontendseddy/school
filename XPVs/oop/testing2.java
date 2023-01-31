package XPVs.oop;

import fileworks.DataExport;
import fileworks.DataImport;

public class testing2 {
    public static void main(String[] args) {
        osoba2 p;
        DataImport di = new DataImport("osoba.txt");
        String line;
        String[] attributes;

        DataExport de = new DataExport("outputKartaOsob.txt");

        while (di.hasNext()) {
            line = di.readLine();
            attributes = line.split(",");
            p = new osoba2(Integer.parseInt(attributes[1]), Integer.parseInt(attributes[2]), Integer.parseInt(attributes[3]), attributes[0]);
            //System.out.print(p);

            //zapis do souboru
            de.writeString(p.toString());

        }
        // di.finishImport();
        de.finishExport();
    }
}
