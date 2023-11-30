// TUMULAK, IVAN STEIVEN - ACTIVITY 30

import com.sun.jdi.Method;
import java.util.Scanner;
public class MethodOverriding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal obj1 = new Animal();
        obj1.displayInfo();
        Dog obj2 = new Dog();
        obj2.displayInfo();

        System.out.println();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.println("Age 5 years from now: " + obj1.calculateAge(age));
        System.out.println("Age 10 years from now: " + obj2.calculateAge(age));
    }
}

class Animal {
    public void displayInfo() {
        System.out.println("I am an animal.");
    }

    public int calculateAge(int age){
        return age + 5;
    }
}

class Dog extends Animal {
    @Override
    public void displayInfo() {
        System.out.println("I am a dog.");
    }

    @Override
    public int calculateAge(int age) {
        return age + 10;
    }
}