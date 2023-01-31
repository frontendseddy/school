package XPVs.interfacesxd;

import java.util.Comparator;

public class ByAge implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.age, o2.age);
    }
}
