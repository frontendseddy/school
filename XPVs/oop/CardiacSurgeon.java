package XPVs.oop;

public class CardiacSurgeon extends Surgeon{
    public CardiacSurgeon(String name) {
        super(name);
        salary += 750000;
        System.out.println("I am CardioSurgeon");
    }
}
