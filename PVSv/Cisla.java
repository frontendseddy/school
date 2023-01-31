package PVSv;

public class Cisla {

    public static void main(String[] args) {
        Prvocisla(1, 100);
        Suda(1, 100);
        Nasobek(12, 9);
        Hodiny(72);
    }

    static void Prvocisla(int cislo1, int cislo2) {
        String prvocisla = "";
        for (int i = cislo1; i <= cislo2; i++) {
            int pom = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    pom = pom + 1;
                }
            }
            if (pom == 2) {
                prvocisla = prvocisla + i + " ";
            }
        }
        System.out.println("\nPrvocisla od " + cislo1 + " do cisla " + cislo2 + " jsou:");
        System.out.print(prvocisla);
    }

    static void Suda(int cislo1, int cislo2) {
        System.out.println("\nSuda: ");
        int pom = 0;
        for (int i = cislo1; i < cislo2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                pom++;
                if (pom % 10 == 0) {
                    System.out.println("\n");
                }
            }
        }
    }

    static void Nasobek(int cislo1, int cislo2) {
        System.out.println("\nNasobek:");
        int gcd = 1;
        for (int i = 1; i <= cislo1 && i <= cislo2; ++i) {
            if (cislo1 % i == 0 && cislo2 % i == 0) {
                gcd = i;
            }
        }
        int lcm = (cislo1 * cislo2) / gcd;
        System.out.printf("Spolecny nasobek cisel %d a %d je %d.", cislo1, cislo2, lcm);
    }
    static void Hodiny(int hours) {
        System.out.println("\nHodiny: ");
        int week = hours / 168;
        hours = hours % 168;
        int days = hours / 24;
        hours = hours % 24;
        System.out.printf("Tydny: %d Dny: %d Hodiny: %d", week, days, hours);
    }
}
