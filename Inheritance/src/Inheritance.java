public class Inheritance {
    public static void main(String[] args) {
        Animal objAnimal = new Animal();
        objAnimal.display();

        System.out.println("---------------------");

        Dog objDog = new Dog();
        objDog.display();
        objDog.makeSound();

        System.out.println("---------------------");

        Cat objCat = new Cat();
        objCat.display();

        System.out.println("---------------------");

        Bird objBird = new Bird();
        objBird.display();
        objBird.makeSound();
    }
}
