import java.util.Scanner;

public class Activity24 {
    public static int add(int num1, int num2){
        int sum = num1 + num2;
        
        return sum;
    }
    
    public static int sub(int num1, int num2){
        int diff = num1 - num2;
        
        return diff;
    }
    
    public static int mul(int num1, int num2){
        int prod = num1 * num2;
        
        return prod;
    }
    
    public static float div(int num1, int num2){        
        return (float) num1 / num2;
    }
    
    public static int mod(int num1, int num2){
        int md = num1 % num2;
        
        return md;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice, num1, num2, result;
        float resultf;
        
        while(true){
            System.out.println("Choose an operation");
            System.out.println("1.) Addition");
            System.out.println("2.) Subtraction");
            System.out.println("3.) Multiplication");
            System.out.println("4.) Division");
            System.out.println("5.) Modulo");
            System.out.println("0.) Exit Program");
            System.out.print("Enter Operation: ");
            choice = sc.nextInt();
            
            if(choice == 0)
                break;
            
            switch(choice){
                case 1:
                    System.out.println("You have selected Addition");
                    System.out.print("Enter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    result = add(num1, num2);
                    System.out.println("The sum is: " + result);
                    break;
                case 2:
                    System.out.println("You have selected Subtraction");
                    System.out.print("Enter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    result = sub(num1, num2);
                    System.out.println("The difference is: " + result);
                    break;
                case 3:
                    System.out.println("You have selected Multiplication");
                    System.out.print("Enter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    result = mul(num1, num2);
                    System.out.println("The product is: " + result);
                    break;
                case 4:
                    System.out.println("You have selected Division");
                    System.out.print("Enter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    resultf = div(num1, num2);
                    System.out.println("The quotient is: " + resultf);
                    break;
                case 5:
                    System.out.println("You have selected Modulo");
                    System.out.print("Enter First number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter Second number: ");
                    num2 = sc.nextInt();
                    result = mod(num1, num2);
                    System.out.println("The remainder is: " + result);
                    break;
                default:
                    System.out.print("Invalid Choice!\n");
                    break;
            }
        }
    }
}
