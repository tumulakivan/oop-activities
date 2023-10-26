/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author L15Y13W03
 */
public class Activity13 {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void cont(Scanner eeban){
        int count = 0, sum = 0, x;
        System.out.println("Enter numbers here:");
        while(true){
            x = eeban.nextInt();
            if(x == 0)
                break;
            sum += x;
            count++;
        }
        if(count >= 2){
            float avg = (float)sum / count;
            System.out.println("Sum: " + sum);
            System.out.println("Average: " + df.format(avg));
        }
        else if(count == 1)
            System.out.println("Please, input at least 2 or more values.");
        else
            System.out.println("No values to compute!");
    }
    
    public static void main(String[] args){
        Scanner eeban = new Scanner(System.in);
        cont(eeban);
    }
}
