package PVSv;

public class cisla2 {
    public static void main(String[] args) {
        // factorial(5);
        // System.out.println(isFactorial(6));
        // System.out.println(Temperature(160, "F"));
        // sumOfSides(21);
        Fibonacci(60);
        triangle1(5);
    }

    static void factorial(int a) {
        int tmp = 1;
        for (int i = 1; i <= a; i++) {
            tmp *= i;
        }
        System.out.println(tmp);
    }

    static String isFactorial(int a) {
        for (int i = 1; i <= a; i++) {
            a /= i;
        }
        if (a == 1) {
            return ("is factorial");
        } else {
            return "isn´t factorial";
        }
    }

    static double Temperature(int temp, String unit) {
        double convertion;
        if (unit.equalsIgnoreCase("C")) {
            convertion = (temp * 1.8) + 32;
        } else {
            convertion = (temp - 32) * 0.5556;
        }
        return convertion;
    }

    static void sumOfSides(int sides) {
        int tmp = 1;
        for (int i = 1; i <= sides; i++) {
            tmp *= i;
        }
        System.out.println("6");
    }

    static void Fibonacci(int a) {
        int first = 0, second = 1;

        System.out.println("Fibonacci Series Upto " + a + ": ");

        while (first <= a) {
            System.out.print(first + ", ");
            int nextTerm = first + second;
            first = second;
            second = nextTerm;
        }
        System.out.println("\n");
    }

    static void triangle1(int a) {
        int pom = 1;
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= pom; j++) {
                System.out.print(pom + " ");
            }
            System.out.println();
            pom++;
        }
    }
}
