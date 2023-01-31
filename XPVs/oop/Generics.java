package XPVs.oop;

public class Generics {
    static <T> void printArray(T[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();

    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max = x;
        if (y.compareTo(x) > 0){
            max = y;
        }
        if (y.compareTo(max) > 0) {
            max = z;
        }
        return max;
    }

    //genericky bubblesort
    static <E extends Comparable<E>> void bubbleSort(E[] toSort) {
        E tmp;
        for (int i = 0; i < toSort.length - 1; i++) {
            for (int j = 0; j < toSort.length - i - 1; j++) {
                if (toSort[j].compareTo(toSort[j + 1]) > 0) {
                    tmp = toSort[j];
                    toSort[j] = toSort[j+1];
                    toSort[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {4,6,1,8,9,3,56};
        Double[] doubleArray = {9.9, 0.3, .6, -.9};
        String[] words = {"ameno", "lorem", "domines", "ipsum"};
        Character[] characters = {' ', 'h', 'o', 'i'};
        bubbleSort(intArray);
        bubbleSort(doubleArray);
        bubbleSort(words);
        bubbleSort(characters);
//        printArray(intArray);
//        printArray(doubleArray);
//        printArray(words);
//        printArray(characters);

        System.out.println("maximum z 2.5, .05, 4.2");
        System.out.println(maximum(2.5, .05, 4.2));
        System.out.println("maximum z 2.5, .05, 4.2");
        System.out.println(maximum(2.5, .05, 4.2));
        System.out.println("maximum z 2, 5, 3");
        System.out.println(maximum(2, 5, 3));
        System.out.println("maximum z 'aloha', 'greetings', 'ola'");
        System.out.println(maximum("aloha", "greetings", "ola"));



    }
}