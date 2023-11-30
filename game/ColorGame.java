// TUMULAK, IVAN STEIVEN A.
import java.util.Scanner;

public class ColorGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chowes;

        System.out.println("-----COLOR-----");
        System.out.println("Press 1 - GREEN");
        System.out.println("Press 2 - BLUE");
        System.out.println("Press 3 - RED");
        System.out.println("Press 4 - YELLOW");
        System.out.println("Press 5 - ORANGE");
        System.out.println("Press 6 - FENK");
        chowes = sc.nextInt();

        Play objPlay = new Play(0);
        while(objPlay.ctr < 1000) {
            try {
                Thread.sleep(50);
                objPlay.selectColor();
                objPlay.checker(chowes);
            }
            catch(InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}