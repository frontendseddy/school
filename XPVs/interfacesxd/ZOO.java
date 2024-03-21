package XPVs.interfacesxd;

import java.util.Arrays;

public class ZOO {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        Fish fish = new Fish();
        cat.makeSound();
        // Animal dog2 = new Dog();
        Animal[] zoo = new Animal[] {cat, dog, fish};
        zoo[2].makeSound();
    }
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Moew");
    }
}
class Fish implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Bubble");
    }
}