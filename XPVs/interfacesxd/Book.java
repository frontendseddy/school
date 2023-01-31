package XPVs.interfacesxd;

import java.util.Objects;

public class Book {
    String name, author;
    int IBM;

    public Book(String name, String author, int IBM) {
        this.name = name;
        this.author = author;
        this.IBM = IBM;
    }

    @Override
    public boolean equals(Object o) {
        Book tmp = (Book) o;
        return this.IBM == tmp.IBM;
    }

    public static void main(String[] args) {
        Book lotr = new Book("Lord of the Rings","J. R. R. Tolkien", 2215);
        Book lordOfTheRings = new Book("The Lord of the Rings, The return of the King", "John Ronald Reuel Tolkien", 2215);

        System.out.println("Are they same? " + lotr.equals(lordOfTheRings));
    }
}
