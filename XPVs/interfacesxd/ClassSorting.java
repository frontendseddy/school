package XPVs.interfacesxd;

import java.util.ArrayList;
import java.util.Collections;

public class ClassSorting {
    public static void main(String[] args) {
        Person Karel = new Person("Karel", 42, 42.9);
        Person Josef = new Person("Josef", 36, 49.1);
        Person Jan = new Person("Jan", 24, 40.0);
        ArrayList<Person> people = new ArrayList<>();
        people.add(Karel);
        people.add(Josef);
        people.add(Jan);
        System.out.println(people.toString());

        System.out.println("\n Podle veku: ");

        Collections.sort(people, Person.BY_AGE);
//magic
         System.out.println(people);

    }

}
