package XPVs;

import java.util.Arrays;

public class Sorting {
    static void change(int a[]) {
        Arrays.sort(a);
    }
    static void swap(int[]pole, int index1, int index2) {
        int tmp;
        tmp = pole[index1];
        pole[index1] = pole[index2];
        pole[index2] = tmp;
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,52,3,5};
        //change(array);
        System.out.println(Arrays.toString(array));
        swap(array, 1, 2);
        System.out.println(Arrays.toString(array));
    }
}
