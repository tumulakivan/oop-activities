// Activity 26 - TUMULAK, IVAN STEIVEN A.
import java.util.Scanner;
import java.text.DecimalFormat;

public class Person {
    String name;
    String address;
    int age;
    float cash;

    private static final DecimalFormat df = new DecimalFormat(",000.00");

    Person(String name, String address, int age, float cash){
        this.name = name;
        this.address = address;
        this.age = age;
        this.cash = cash;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name, address;
        int age;
        float cash;

        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter address: ");
        address = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter cash on-hand: ");
        cash = sc.nextFloat();
        Person p = new Person(name, address, age, cash);

        System.out.println();
        System.out.println();

        System.out.println("Name: " + p.name);
        System.out.println("Address: " + p.address);
        System.out.println("Age: " + p.age);
        System.out.println("Money: " + df.format(p.cash));
        sc.close();
    }
}