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
public class Activity5 {
    public static float add(float x, float y){
       return x + y; 
    }
    
    public static float dif(float x, float y){
        return x - y;
    }
    
    public static float mul(float x, float y){
        return x * y;
    }
    
    public static float div(float x, float y){
        return x / y;
    }
    
    public static float mod(float x, float y){
        return x % y;
    }
    
    public static void main(String[] args){
        float a, b;
        Scanner eeban = new Scanner(System.in);
        
        System.out.print("Enter 1st number: ");
        a = eeban.nextFloat();
        System.out.print("Enter 2nd number: ");
        b = eeban.nextFloat();
        eeban.close();
        
        System.out.println("Sum: " + add(a, b));
        System.out.println("Difference: " + dif(a, b));
        System.out.println("Product: " + mul(a, b));
        System.out.println("Quotient: " + div(a, b));
        System.out.println("Remainder: " + mod(a, b));
    }
}
