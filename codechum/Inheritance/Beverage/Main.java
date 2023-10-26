import java.util.*;

public class Main {
    public static void main(String args[]) {
        String type, waterType;
        char chill;
        int volume;
        double alcoholicContent;
        boolean isChilled;
        Scanner sc = new Scanner(System.in);

        System.out.print("Select type (1 - Water, 2- Beer): ");
        type = sc.nextLine();
        System.out.print("Enter volume: ");
        volume = sc.nextInt();
        System.out.print("Is chilled (Y - yes, N - no): ");
        sc.nextLine();
        chill = sc.next().charAt(0);
        if(chill == 'Y')
            isChilled = true;
        else
            isChilled = false;
        if(type == "1") {
            type = "Water";
            System.out.print("Type: ");
            sc.nextLine();
            waterType = sc.nextLine();
        }
        else {
            type = "Beer";
            System.out.print("Alcoholic Content: ");
            sc.nextDouble();
        }
        // NOTE: Uncomment the line below when you want to submit your solution already
        // Tester.test(someBeverage);
    }
}