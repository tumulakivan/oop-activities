import java.util.Scanner;

public class Activity22 {
    public static void main(String[] args){
        int row, col;
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.print("Enter rows: ");
            row = sc.nextInt();
            System.out.print("Enter columns: ");
            col = sc.nextInt();

            if(row <= 0 || col <= 0)
                System.out.println("Values must be 1 or above.");
            else
                break;
        }
        
        int[][] arr = new int[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                System.out.print("arr[" + i + "][" + j + "] ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
