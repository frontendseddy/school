package XPVs.oop;

public class Osoba {
    //atributy
    private String name; //deklarace
    private int age;
    private double shoeSize;

    public Osoba(String name, int age, double shoeSize) {
        this.name = name;
    }
    public Osoba(int age, String name, double shoeSize) {
        this.name = "default";
        this.shoeSize = shoeSize;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(double shoeSize) {
        this.shoeSize = shoeSize;
    }
}
