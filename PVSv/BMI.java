package PVSv;

public class BMI {
    String jmeno;
    int vaha;
    double vyska;

    public BMI(String Jmeno, int Vaha, Double Vyska) {
        jmeno = Jmeno;
        vaha = Vaha;
        vyska = Vyska;
    }

    public static void Mereni(BMI p1) {
        double pom = (p1.vaha) / (Math.pow(p1.vyska, 2));
        System.out.format("Vase bmi je: " + "%.2f", pom);
        System.out.println();
        if (pom < 18.5) {
            System.out.print("podvaha");
        } else {
            if (pom > 18.5 && pom < 24.9) {
                System.out.print("optimalni vaha");
            } else {
                System.out.print("nadvaha");
            }
        }
    }

    public static void main(String[] args) {
        BMI p1 = new BMI("Masa", 85, 1.80);
        Mereni(p1);
    }
}
