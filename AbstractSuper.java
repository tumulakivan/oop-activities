// TUMULAK, IVAN STEIVEN A. - ACTIVITY 33

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void makeSound();

    void eat() {
        System.out.println("Animal is eating.");
    }
}

class Dog extends Animal {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Dog(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    void makeSound() {
        System.out.println("Woof!");
    }

    void wagTail() {
        System.out.println("Dog is wagging its tail.");
    }
}

public class AbstractSuper {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 5);
        myDog.makeSound();
        myDog.wagTail();
        System.out.println("Name: " + myDog.name);
        System.out.println("Age: " + myDog.getAge());
    }
}