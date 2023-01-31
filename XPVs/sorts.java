package XPVs;

import java.util.Arrays;

public class sorts {
    public static void main(String[] args) {
        int[] testArray = new int[]{5, 3, 7, 2, 8, 2, 2, 6, 31, 23};
        System.out.println(Arrays.toString(testArray));
        //bubbleSort(testArray);
        selectionSort(testArray);
        System.out.println(Arrays.toString(testArray));
    }

    static void swap(int[] array, int index0, int index1) {
        int pom = array[index0];
        array[index0] = array[index1];
        array[index1] = pom;
    }

    static void bubbleSort(int[] array) {
        System.out.print("bubbleSort: ");
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    static void selectionSort(int[] array) {
        System.out.print("selectionSort: ");
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            swap(array, minIndex, i);
        }
    }
}
