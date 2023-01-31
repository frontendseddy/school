package XPVs.oop.dedicnost;

import fileworks.DataImport;

public class Hospital {
    static int calculateSalary(Doctor doc, String[] attributes) {
        //od vojky, prvni dva jsou typ a jmeno
        for (int i = 2; i < attributes.length; i++) {
             switch (attributes[i]) {
                 case "Basic":
                     doc.diagnosis();
                     break;
                 case "Surgery":
                     doc.surgery();
                     break;
                 case "CardiacSurgery":
                     doc.cardiacSurgery();
                     break;
             }
        }
        return doc.salary;
    }
    public static void main(String[] args) {
        DataImport di = new DataImport("hospitalDataAdvanced.txt");
        Doctor best = new Doctor(Integer.MIN_VALUE, "TMO");
        Doctor worst = new Doctor(Integer.MAX_VALUE, "FAKE_DOC");
        String[] attributes;
        String line;
        Doctor doc = null;
        while (di.hasNext()) {
            line = di.readLine();
            attributes = line.split(";");
            switch (attributes[1]) {
                case "S":
                    doc = new Surgeon(-80000, attributes[0]);
                    break;
                case "D":
                    doc = new Doctor(-40000, attributes[0]);
                    break;
                case "C":
                    doc = new CardiacSurgeon(-120000, attributes[0]);
                    break;
            }
            System.out.println(doc.name + " vydelal: " + calculateSalary(doc, attributes));
            //pokud ma mene jak nejhrosi je z nej novy nejhorsi
            if (doc.salary < worst.salary){
                worst = doc;
            }
            if (doc.salary > best.salary) {
                best = doc;
            }
        }
        System.out.println("\n---REPORT---\n");
        System.out.println("Promote " + best.name + ", he brought us " + best.salary + " $");
        System.out.println("Fire " + worst.name + ", he brought us only " + worst.salary + " $");
        di.finishImport();
    }
}




