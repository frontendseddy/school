package XPVs.oop;

public class Surgeon extends Doctor{
    public Surgeon(String name) {
        super(name);
        salary += 25000;
        System.out.println("I am Surgeon");
    }

    void stich() {
        System.out.println("Sewing up!");
    }
}
