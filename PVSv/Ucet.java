package PVSv;

import java.util.Scanner;

public class Ucet {
    String cisloUctu;
    String Jmeno;
    int zustatek;
    int pin;

    public Ucet(String cislouctu, String jmeno, int Zustatek, int Pin) {
        cisloUctu = cislouctu;
        Jmeno = jmeno;
        zustatek = Zustatek;
        pin = Pin;
    }

    public static void vyberpenize(int pom2, Ucet u1) {
        int pom = pom2;
        if (u1.zustatek >= pom) {
            if (pom % 100 == 0) {
                while (pom != 0) {
                    if (pom >= 5000) {
                        pom = pom - 5000;
                        u1.zustatek -= 5000;
                        System.out.println("Vybral/a jste 5000");
                    } else if (pom >= 2000) {
                        pom = pom - 2000;
                        u1.zustatek -= 2000;
                        System.out.println("Vybral/a jste 2000");
                    } else if (pom >= 1000) {
                        pom = pom - 1000;
                        u1.zustatek -= 1000;
                        System.out.println("Vybral/a jste 1000");
                    } else if (pom >= 500) {
                        pom = pom - 500;
                        u1.zustatek -= 500;
                        System.out.println("Vybral/a jste 500");
                    } else if (pom >= 200) {
                        pom = pom - 200;
                        u1.zustatek -= 200;
                        System.out.println("Vybral/a jste 200");
                    } else if (pom >= 100) {
                        pom = pom - 100;
                        u1.zustatek -= 100;
                        System.out.println("Vybral/a jste 100");
                    } else {
                        break;
                    }
                }
            } else {
                System.out.println("Toto cislo neni nasobek stovky!!");
            }
        } else {
            System.out.println("malo penez na uctu");
        }
    }

    public static void vypisZUctu(Ucet u1, Ucet u2) {
        System.out.println(u1.Jmeno + " ma na uctu " + u1.zustatek + " Kc.");
        System.out.println(u2.Jmeno + " ma na uctu " + u2.zustatek + " Kc.");
    }

    public static void Prevod(int castka, Ucet u1, Ucet u2) {
        Scanner scn = new Scanner(System.in);
        if (u1.zustatek>=castka) {
            System.out.println("Zadejte pin: ");
            if (u1.pin == scn.nextInt()) {
                u1.zustatek -= castka;
                u2.zustatek += castka;
                System.out.println("Prevedl jste na ucet " + castka);
            }
            else {
                System.out.println("Spatny pin");
            }
        }
        else {
            System.out.println("Malo penez");
        }
    }

    //-------------------------------------------//

    public static void main(String[] args) {
        Ucet u1 = new Ucet("4707437907/3030", "Domi Chabr", 9720, 1234);
        Ucet u2 = new Ucet("1096492381/3030", "Misa Chabr", 800, 4321);
        vypisZUctu(u1, u2);
        Prevod(400, u1, u2);
        vyberpenize(1000, u1);
        vypisZUctu(u1, u2);
    }
}
