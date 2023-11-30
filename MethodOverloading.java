//Activity 28 - TUMULAK

import java.util.Scanner;

public class MethodOverloading {
    private void display(int a){
        System.out.println("Method overload for age output: " + a);
    }

    private int display(int a, int b){
        return a * b;
    }

    public void display(String last, String first){
        System.out.println("Method overload for name output: " + last + ", " + first);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String last, first;
        int age, num1, num2;

        System.out.print("Enter last name: ");
        last = sc.nextLine();
        System.out.print("Enter first name: ");
        first = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        MethodOverloading myMO = new MethodOverloading();
        myMO.display(last, first);
        myMO.display(age);
        System.out.println("Method overload for product of " + num1 + " and " + num2 + " is: " + myMO.display(num1, num2));

        sc.close();
    }
}