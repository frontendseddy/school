package PVSv;
import java.util.Collections;
import java.util.HashSet;

public class pocty {
    public static void prumer(double a, double b, double c) {
        System.out.println("Prumer je: " + (a + b + c) / 3);
        System.out.println();
    }

    public static void operace(double a, double b) {
        System.out.println("Soucet: " + (a + b));
        System.out.println("Rozdil: " + (a - b));
        System.out.println("Soucin: " + (a * b));
        System.out.println("Podil: " + (a / b));
        System.out.println();
    }

    public static void MaxMin(int a, int b, int c) {
        HashSet<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        System.out.println("Maximum: " + Collections.max(set));
        System.out.println("Minimum: " + Collections.min(set));
        System.out.println();
    }

    public static void trojuhelnik(int a, int b, int c) {
        if ((a + b) > c && (b + c) > a && (c + a) > b) {
            System.out.println("Lze sestrojit");
        }
        else {
            System.out.println("Nelze sestrojit" );
        }

        System.out.println("Obsah trojuhleniku: " + (a+b+c)/c);
        System.out.println("Obvod je: " + (a + b + c));
        System.out.println();
    }
    public static void kvadr(int a, int b, int c) {
        System.out.println("Objem je: " + (a*b*c));
        System.out.println("Povrch je: " + (2 * ((a * b)) + (a * c) + (b * c)));
        System.out.println();
    }
    public static void interval(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        prumer(5, 4, 3);
        operace(4, 5);
        MaxMin(5, 4, 3);
        trojuhelnik(7, 5, 6);
        kvadr(5, 6, 7);
        interval(5, 9);
    }


}
