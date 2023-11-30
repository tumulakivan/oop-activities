import java.util.Random;
import java.text.DecimalFormat;

public class Play implements Cube {
    public int cubeColor1;
    public int chowes;
    public int balance = 0;
    public int ctr = 0;
    public int win = 0;
    public int lose = 0;

    Random rand = new Random();
    private static final DecimalFormat df = new DecimalFormat("#0.00");

    public Play(int cubeColor1){
        this.cubeColor1 = cubeColor1;
    }

    @Override
    public void checker(int chowes) {
        float wr = (float) this.win * 100 / this.ctr;

        if(cubeColor1 == chowes) {
            this.balance += 3000;
            this.ctr++;
            this.win++;
            System.out.println("Win!");
            System.out.println("Balance: " + this.balance);
            System.out.println("Win rate: " + df.format(wr) + "%");
        }
        else {
            this.balance -= 1000;
            this.ctr++;
            this.lose++;
            System.out.println("Lose.");
            System.out.println("Balance: " + this.balance);
            System.out.println("Win rate: " + df.format(wr) + "%");
        }
    }

    @Override
    public void selectColor() {
        cubeColor1 = rand.nextInt(6) + 1;

        switch(cubeColor1) {
            case 1:
                System.out.println("The cube 1 result is: GREEN");
                break;
            case 2:
                System.out.println("The cube 1 result is: BLUE");
                break;
            case 3:
                System.out.println("The cube 1 result is: RED");
                break;
            case 4:
                System.out.println("The cube 1 result is: YELLOW");
                break;
            case 5:
                System.out.println("The cube 1 result is: ORANGE");
                break;
            case 6:
                System.out.println("The cube 1 result is FENK");
                break;
        }
    }
}