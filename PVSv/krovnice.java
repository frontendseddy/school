package PVSv;

public class krovnice {
    public static void main(String[] args) {
        int a = 2;
        int b = 6;
        int c = -20;
        System.out.println(vypisKRovnici(a, b, c));
    }

    public static String vypisKRovnici(int a, int b, int c) {
        double koren1 = 0;
        double koren2 = 0;
        double vzorec = (b * b) - (4 * a * c);
        double sqrt = Math.sqrt(vzorec);

        if (vzorec > 0) {
            koren1 = (-b + sqrt) / (2 * a);
            koren2 = (-b - sqrt) / (2 * a);
            return ("Koreny jsou: " + "[ " + koren1 + " ; " + koren2 + " ]");
        } else if (vzorec == 0) {
            return ("Koreny jsou: " + (-b + sqrt) / (2 * a));
        }
        return null;
    }
}
