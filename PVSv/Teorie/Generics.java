package PVSv.Teorie;

import java.util.ArrayList;

public class Generics <T> {
    T attribute;

    public Generics(T attribute) {
        this.attribute = attribute;
    }

    public static void main(String[] args) {
        ArrayList<Integer> something = new ArrayList<>();
        System.out.println(areSame("Somthing", "else"));
        System.out.println(areSame(4, 1));
        new Generics<Integer>(56);
        ArrayList<Generics> somethingElse;
        Math.round(2); //zaokrouhleni na x desetinych mist
    }

    public static <E> boolean areSame(E first, E second) {
        System.out.println("Are they same?");
        return first.equals(second);
    }
}
