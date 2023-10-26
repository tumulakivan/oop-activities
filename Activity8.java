/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;
import java.util.Scanner;

/**
 *
 * @author L15Y13W03
 */
public class Activity8 {
    public static int getInt(Scanner eeban){
        System.out.print("Enter a number: ");
        
        return eeban.nextInt();
    }
    
    public static void either(int a){
        if(a % 2 == 0)
            System.out.print("The number " + a + " is Even.");
        else
            System.out.print("The number " + a + " is Odd.");
    }
    
    public static void main(String[] args){
        Scanner eeban = new Scanner(System.in);
        int num = getInt(eeban);
        either(num);
        eeban.close();
    }
}
