package PVSv.Linked;

public class Person {
    String name;
    int age;
    double shoeSize;


    public Person(String name, int age, double shoeSize) {
        this.name = name;
        this.age = age;
        this.shoeSize = shoeSize;
    }

    public static void main(String[] args) {
        Person jan = new Person("Jan", 25, 42);
        Person karel = new Person("Karel", 40, 41);
        Person libor = new Person("Libor", 31, 45);
        SpecialList list = new SpecialList();

        //vytvori zacatek pro lsit
        Link first = new Link();
        first.data = jan;

        //napoji prvniho do listu
        list.first = first;

        //pripravi dalsi clanek
        Link following = new Link();

        //priradi hodnotu k clanku
        following.data = karel;

        //spoji v listu prvni clanek s pridanym
        list.first.next = following;

        Link finalLink = new Link();
        finalLink.data = libor;
        list.first.next.next = finalLink;



//        System.out.println("First: " +  list.first.data.name);
//        System.out.println("Second: " +  list.first.next.data.name);

        //Link pro vytisk
        Link printer = new Link();
        printer = list.first;
        while (printer.next != null) {
            System.out.println(printer.data.name);
            Link tmp = printer.next.next;
            printer = printer.next;
            printer.next = tmp;
        }
    }
}

class Link {
    Person data;
    Link next;
}

class SpecialList {
    Link first;
}
