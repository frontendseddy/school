package XPVs.another;

public class main {
    public static int recursive(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return (a * recursive(a, n - 1));
    }

    public static void main(String[] args) {
        System.out.println(recursive(2, 5));
    }

}

