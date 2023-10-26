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
public class Activity4 {
    public static void main(String[] args){
        Scanner eeban = new Scanner(System.in);
        int num1, num2, sum;
        
        System.out.print("Enter 1st number: ");
        num1 = eeban.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = eeban.nextInt();
        eeban.close();
        sum = num1 + num2;
        
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");
    }
    
}
