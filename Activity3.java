/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaactivity;

/**
 *
 * @author L15Y13W03
 */
import java.util.Scanner;

public class Activity3 {
    public static void main(String args[]){
        String name;
        char sex;
        int age;
        float grade;
        Scanner eeban = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        name = eeban.nextLine();
        System.out.print("Enter age: ");
        age = eeban.nextInt();
        System.out.print("Enter sex: ");
        sex = eeban.next().charAt(0);
        System.out.print("Enter grade in Programming 1: ");
        grade = eeban.nextFloat();
        
        System.out.print("Hi, " + name + ". You are " + age + " years old.\nYou are " + sex + " and your Programming 1 grade is " + String.format("%.2f",grade) + ".");
    }
}
