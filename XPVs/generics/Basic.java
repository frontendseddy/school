package XPVs.generics;

import java.util.ArrayList;

public class Basic {

    static <T> void printArray(T[] array) {
        //vypise cele pole
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }

    static <T extends Comparable<T>> T greater(T first, T second) {
        if(first.compareTo(second) > 0) {
            return first;
        }
        else {
            return second;
        }
    }

    static <T extends Comparable<T>> void bubbleSortGeneric(T[] array) {
        T tmp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {
        Integer[] intArray = {4,6,1,8,9,3,56};
        Double[] doubleArray = {9.9, 0.3, .6, -.9};
        String[] words = {"ameno", "lorem", "domines", "ipsum"};
        Character[] characters = {' ', 'h', 'o', 'i'};

        printArray(intArray);
    }
}
