package PVSv;

public class bankomat {

    private static void vyberpenize(int pom) {
        int b = 0;
        if (pom % 100 == 0) {
            while (pom != 0) {
                if (pom >= 5000) {
                    pom = pom - 5000;
                    System.out.println("5000");
                } else if (pom >= 2000) {
                    pom = pom - 2000;
                    System.out.println("2000");
                } else if (pom >= 1000) {
                    pom = pom - 1000;
                    System.out.println("1000");
                } else if (pom >= 500) {
                    pom = pom - 500;
                    System.out.println("500");
                } else if (pom >= 200) {
                    pom = pom - 200;
                    System.out.println("200");
                } else if (pom >= 100) {
                    pom = pom - 100;
                    System.out.println("100");
                } else {
                    break;
                }
            }
        } else {
            System.out.println("Toto cislo neni nasobek stovky!!");
        }
    }

    public static void main(String[] args) {
        vyberpenize(15300);
    }
}
