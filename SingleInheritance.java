//Activity 29 - TUMULAK

class Animal{
    public void makeSound(){
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    public void bark(){
        System.out.println("Woof! Woof!");
    }
}

public class SingleInheritance{
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        Dog objDog = new Dog();

        objAnimal.makeSound();
        objDog.makeSound();
        objDog.bark();
    }
}