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
public class Activity7 {
    public static void ageCatg(int a){
        if(a >= 18 && a < 59)
            System.out.print("Let's Party!");
        else if(a < 18 && a >= 0)
            System.out.print("Please go home and sleep");
        else if(a >= 59)
            System.out.print("Take a rest");
        else
            System.out.print("Invalid input");
    }
    
    public static void main(String[] args){
        int age;
        Scanner eeban = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        age = eeban.nextInt();
        ageCatg(age);
        eeban.close();
    }
    
}
