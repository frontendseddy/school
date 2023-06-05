package XPVs.testy;

import java.util.ArrayList;

interface Readable {
    void read();
    String getText();
}

/**
 * Hlavni trida pro ukol, pouziva pomocne rozhrani a dve tridy umistene v souboru
 * Trida TextMSG je pro ukazku, funkcionalitu doplnujete zde (GreatTale) a do Tridy Book
 */
public class GreatTale {
    /**
     * Tato metoda by mela zvladnout praci s TextMsg i Book
     */
    static int wordCount(Readable readable) {
        String tmp = readable.getText();
        String[] lines = tmp.split(" ");
        return lines.length;
    }

    static void init() {
        ArrayList<String> LOTR = new ArrayList<>();
        LOTR.add("One Ring to rule them all. "); //stranka #1
        LOTR.add("Folk takes their peril with them into Lorien. ");
        LOTR.add("Hinder me? Thou fool. No living man may hinder me! ");
        LOTR.add("Don’t the great tales never end?"); //stranka #4

        TextMsg msg = new TextMsg("Johnny", "27-06-2003", "Oh, Hi Mark!");
        Book LordOTR = new Book("Lord of the rings", "J. R. R. Tolkien", "29-07-1968", 243, LOTR);
        Book LordOfTheRings = new Book("Lord of the rings", "John Ronald Reuel Tolkien", "29-07-1968", 243, LOTR);
        System.out.println(LordOTR.equals(LordOfTheRings));//melo by vratit True, maji stejne knizni ID (IBM)

        System.out.println("Wordcount for LOTR: " + wordCount(LordOTR));
        System.out.println("Wordcount for Msg: " + wordCount(msg));

        System.out.println("LOTR read:");
        LordOfTheRings.read();

        System.out.println("Message read:");
        msg.read();
    }

    public static void main(String[] args) {
        init();
    }
}

/**
 * Zde je vas ukol pro implementaci dle zadani
 */
class Book implements Readable, Comparable<Book> {
    String name;
    String auhtor;
    String yearOfRelease;
    ArrayList<String> pages;
    int IBM;

    public Book(String name, String auhtor, String yearOfRelease, int IBM, ArrayList<String> pages) {
        this.name = name;
        this.auhtor = auhtor;
        this.yearOfRelease = yearOfRelease;
        this.pages = pages;
        this.IBM = IBM;
    }

    @Override
    public boolean equals(Object obj) {
        Book temp = (Book) obj;
        return temp.IBM == this.IBM;
    }

    @Override
    public int compareTo(Book o) {
        return o.pages.size() - this.pages.size();
    }

    @Override
    public void read() {
        System.out.println(name);
        System.out.println("Written by: " + auhtor);
        System.out.println(yearOfRelease);

        for (int i = 1; i <= pages.size(); i++) {
            System.out.println("Page " + i + "/" + pages.size());
            System.out.println(pages.get(i - 1));
        }
    }

    @Override
    public String getText() {
        StringBuilder sb = new StringBuilder();
        for (String pg : pages) {
            sb.append(pg + "\n");
        }
        return sb.toString();
    }
}

class TextMsg implements Readable, Comparable<TextMsg> {
    String sender;
    String date;
    String text;

    public TextMsg(String sender, String date, String text) {
        this.sender = sender;
        this.date = date;
        this.text = text;
    }

    @Override
    public int compareTo(TextMsg o) {
        String another = o.sender;
        return this.sender.compareTo(another);
    }

    @Override
    public void read() {
        System.out.println("Message received " + date);
        System.out.println(sender + " wrote: ");
        System.out.println(text);
    }

    @Override
    public String getText() {
        return text;
    }
}
