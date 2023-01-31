package XPVs.oop;

public class osoba2 {
    int height, weight, age;
    String name;

    public osoba2(int height, int weight, int age, String name) {
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "--------------------\n" +
                "Name: " + name + "\n" +
                "Height: " + height + "\n" +
                "Weight: " + weight + "\n" +
                "Age: " + age + "\n" +
                "--------------------\n";
    }
}
