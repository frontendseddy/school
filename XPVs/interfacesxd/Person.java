package XPVs.interfacesxd;

import java.util.Comparator;
import java.util.stream.Collector;

public class Person implements Comparable<Person>{
    String name;
    int age;
    double shoeSize;

    public Person(String name, int age, double shoeSize) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    @Override
    public String toString() {
        return "\n name= " + name + ", age= " + age + ", shoeSize= " + shoeSize ;
    }

    /**
     *
     * Porovnava osoby na zaklade veku
     *
     */

    @Override
    public int compareTo(Person o) {
//        return this.age - o.age;
        return (int)(this.shoeSize - o.shoeSize);
    }


    public static Comparator<Person> BY_AGE = new Comparator<Person>() {
        @Override
        public int compare(Person o1, Person o2) {
            return Integer.compare(o1.age, o2.age);
        }
    };
}
